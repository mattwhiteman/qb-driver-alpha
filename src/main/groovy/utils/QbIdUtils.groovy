package utils

import entities.globals.QbGeneralMetadata
import entities.globals.QbGlobalUid
import org.hibernate.Criteria
import org.hibernate.Session
import org.hibernate.criterion.Restrictions

public class QbIdUtils
{
	public static String getNextGlobalId(Session sess)
	{
		Criteria criteria = sess.createCriteria(QbGlobalUid)

		QbGlobalUid globalIdObj = criteria.list().get(0)

		String nextId = globalIdObj.abmId

		globalIdObj.abmId = incrementAbmString(nextId)

		sess.update(globalIdObj)
		return nextId
	}

	public static String incrementAbmString(String toIncrement)
	{
		char[] charArray = toIncrement.toCharArray()

		boolean keepIncrementing = true
		int currIndex = charArray.length - 1
		while(keepIncrementing == true)
		{
			int temp = incrementAbmDigit(charArray[currIndex])
			// Ascii char 'z' should increment to '0' and increment next digit by 1 (carry-over)
			if (temp == 123)
			{
				charArray[currIndex] = (char)48
			}
			else
			{
				charArray[currIndex] = (char)temp
				keepIncrementing = false
			}
			currIndex--
		}

		return new String(charArray)
	}
	
	public static void incrementItemModCounter(Session sess)
	{
		Criteria criteria = sess.createCriteria(QbGeneralMetadata)
		criteria.add(Restrictions.eq("key", 24))
		criteria.add(Restrictions.eq("recNum", 3))
		
		QbGeneralMetadata counters = criteria.list().get(0)
		
		incrementByteInArray(counters.dataFld, 0)
		
		sess.update(counters)
	}
	
	private static void incrementByteInArray(byte[] array, int index)
	{
		byte temp = array[index]
		if (temp == (byte)0xff)
		{
			temp = (byte)0x00
			array[index] = temp
			incrementByteInArray(array, index+1)
		}
		else
		{
			temp = temp + (byte)1
			array[index] = temp
		}
	}


	private static char incrementAbmDigit(char digit)
	{
		/**
		 * ABM ids are hexadecimal strings and only accept 0-9, a-z, A-Z. When incrementing, make sure to only
		 * allow legal characters
		 */
		int temp = (int)digit
		temp = temp+1

		// Ascii char '9' should increment to 'A'
		if (temp == 58) temp = 65

		// Ascii char 'Z' should increment to 'a'
		if (temp == 91) temp = 97
		
		return temp
	}
}