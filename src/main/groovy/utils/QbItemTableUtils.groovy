package utils

import entities.QbItemCustomField
import entities.item.QbTotalItem
import org.hibernate.Criteria
import org.hibernate.SQLQuery
import org.hibernate.Session
import org.hibernate.criterion.Order
import org.hibernate.criterion.Restrictions
import org.hibernate.transform.Transformers
import org.hibernate.type.IntegerType
import org.hibernate.type.StringType

public class QbItemTableUtils
{
	public static def fetchCustomFields(Session sess)
	{
		SQLQuery query = sess.createSQLQuery("SELECT cf.abm_id as itemAbmId, cf.position+30 as fieldPosition, cf.field as fieldValue, cft.custom_field_name as fieldName, iu.name as itemName FROM QBAdminGroup.abmc_custom_field cf inner join QBAdminGroup.abmc_custom_field_type cft on cf.position+30=cft.custom_field_position inner join QBAdminGroup.abmc_item_user iu on cf.abm_id=iu.item_abm_id");
		query.setResultTransformer(Transformers.aliasToBean(QbItemCustomField));
		query.addScalar("itemAbmId", StringType.INSTANCE)
		query.addScalar("fieldPosition", IntegerType.INSTANCE);
		query.addScalar("fieldValue", StringType.INSTANCE)
		query.addScalar("fieldName", StringType.INSTANCE);
		query.addScalar("itemName", StringType.INSTANCE);
		def list = query.list();
		
		return list
	}
	
	public static def fetchItems(Session sess)
	{
		Criteria criteria = sess.createCriteria(QbTotalItem)
		criteria.add(Restrictions.eq("isDeleted", false))
		criteria.addOrder(Order.asc("itemType"))
		criteria.addOrder(Order.asc("categoryId"))
		criteria.addOrder(Order.asc("name"))
		
		def result = criteria.list()
		
		return result
	}
}