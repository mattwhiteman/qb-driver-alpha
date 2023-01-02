# Disclaimer:

This code is provided as-is, and is intended only as an interesting academic exercise into the internal workings of Quickbooks Desktop. All information pertains to the desktop client/server version and not the online cloud service. You are free to use this code in any manner, and accept all responsibility for usage. I am not affiliated with Intuit or Quickbooks in any fashion.

Additionally, this code requires some proprietary libraries that are licensed by SAP. I have specifically not included them in this repository, and will not distribute them. You would need to pay for and obtain a SAP license and toolkit and include these db libraries for hibernate to properly talk to the SAP database. All code in this repository is code I have written or generated (no Intuit licensed code), with Maven used to obtain open-source libraries.

## Background:

Quickbooks has long been a source of frustration for users of the software, especially when the company file gets corrupted and Quickbooks will no longer open it, or when the company file fills up with a lot of data and causes the whole thing to run slow. A developer API is provided to allow external software to talk to Quickbooks, but is often buggy, slow, and missing features. Years ago, I tried digging into how Quickbooks works internally in order to better understand it and maybe find a better way of interfacing. All the information provided here is for older versions of the non-cloud Quickbooks software from 2016 and earlier.

The quickbooks database and company file are described as proprietary, but are actually just a standard SAP database. The company file is a SAP db file with the extension changed, the quickbooks transaction log is a db transaction log with a different extension, and the engine bundled with the QB server is the standard SAP SQL Anywhere engine. Because of this, you actually can open and run a company file using SAP tools such as SQL anywhere simply by changing the extension to the correct ones. For QB 2013-15, SQL Anywhere 12 is required, QB 2016 requires SQL Anywhere 16. I have not dug into later versions, but my guess is you just need to figure out the right version of SQL Anywhere to run it.

The most interesting part of all this is the account management and login. When creating a user account in the Quickbooks client, you have to select an account type and assign different privileges, which one would assume propogates to the database. In actuality, all the db accounts have full administrator access (they all belong to the QBAdmin group), and privileges and permissions are handled completely in the client. This means if you can connect to the db engine directly with a QB account, you can explore and modify anything as a DB admin. Connecting is the tricky part though, as the username and password that is entered in Quickbooks is not the same as used to connect to the database. ODBC accounts however, do not have admin access and are not run through any obfuscation (though with another account you could easily log in and put them in the QBAdmin group to change their permissions).

Through some reverse engineering and usage of WinDbg to monitor memory and traffic between a client and server (desktop not online) and figure out the obfuscation algorithm used. The db username is just the ascii hex equivalent of the quickbooks username. So, **Admin** would correspond to **41646d696e**. The database password can be derived from the following steps:

- Combine the quickbooks username and password into a single string.

- Get the sha1 hash of this combined string

- Append **06** to the beginning of the sha1 hash and replace the last 2 characters with **00**

#### Example: ####

- Quickbooks username: **Admin**

- Quickbooks password: **123abc**


1. Combine into a single string: **Admin123abc**
2. Get the sha1 hash: **979c931f84406fc190f6a6f21e512f600d0a881e**
3. Append **06** to the beginning and replace the last 2 characters with **00**: **06979c931f84406fc190f6a6f21e512f600d0a8800**

With this information, you could take a Quickbooks 2016 company file and use a SAP SQL Anywhere engine to load the file in network mode, then connect using SAP SQL Anywhere client with the above credentials. Once in, you would have full admin access to all tables, data, users, etc.

Once logged in, one thing you will quickly realize is how messy and inefficient the schema is. Due to what I assume is legacy compatibility, tech debt, and obfuscation, data is scattered all over the place across multiple tables. Some tables contain enormous binary or string blobs that get modified when a seemingly unrelated change is made elsewhere. Listing all the interesting findings is beyond the scope of this README.

Two cool things this can be used for. One, if your company file is "damaged" and can't be opened by Quickbooks, you can use SAP tools to access and possibly extract data. (In fact, you will find that "damage" has generally not occurred to any of the data directly in tables for items, users, accounts, etc, but instead in the previously mentioned mystery blob data in other tables. This is most likely due to bugs in the software as opposed to actual data corruption.) Two, if you were particularly ambitious, you could create your own software (or even a new client) that uses native SQL to interface with the company file. This is much, much faster and accurate. As an example, exporting thousands of items using the QBXML interface took me about 20 minutes, vs 30 seconds with a SQL query and custom CSV formatter.


### Code information: ###

- The `generatedmodels` directory contains model classes corresponding to each table within a 2016 company file. These classes were automatically generated with hibernate tools based on schema analysis. 
- The `entities` directory contains classes I created when playing around with developing this driver, and there is some duplication with the generated models.
- The `authentication` directory contains the necessary code to obtain usable logins and passwords for the database based on quickbooks usernames and passwords.
- All this code was only tested up to QB 2016. Later versions did make internal changes and increase security, which seem to have changed the transformation algorithm for logins. Thus, this information is mostly invalid for later versions of Quickbooks. It is still based on SAP databases from what I can tell, so you may be able to determine the new obfuscation algorithm if you poke around enough.
- As mentioned in the disclaimer, proprietary libraries licensed by SAP are required to allow hibernate to "speak" to the SAP db and are not distributed within this repository. It is up to you to get those if you want them, and integrate with an application.
- This driver should be considered very-very-very alpha and the code is not intended to be efficient, robust, or follow best practices. This was all done for entertainment and there is a ton of room for improvement.

