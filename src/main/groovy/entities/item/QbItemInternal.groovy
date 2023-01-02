package entities.item

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

// Corresponds to the abmc_item_internal table. This class was created by hand, but should have the same fields and
// functionality as AbmcItemInternal
@Entity
@Table(name="QBAdminGroup.abmc_item_internal")
public class QbItemInternal
{
	@Id
	@Column(name="item_id")
	int itemId
	
	@Column(name="modtimestamp_tms")
	int modTimestampTms
	
	@Column(name="special_type")
	int specialType
	
	@Column(name="latest_target_id")
	int latestTargetId
	
	@Column(name="latest_target_date")
	Date latestTargetDate
	
	@Column(name="on_hand_qnty")
	BigDecimal onHandQuantity
	
	@Column(name="value_on_hand_amt")
	BigDecimal valueOnHand
	
	@Column(name="average_cost_qnty")
	BigDecimal avgCost
	
	@Column(name="on_order_qnty")
	BigDecimal onOrder
	
	@Column(name="sales_order_qnty")
	BigDecimal salesOrder
	
	@Column(name="to_be_built_by_pending_build_txns_qnty")
	BigDecimal toBeBuilt
	
	@Column(name="required_by_pending_build_txns_qnty")
	BigDecimal requiredByPendingBuild
	
	@Column(name="db_modified_tms")
	Date modifiedTms
	
	@Column(name="db_created_tms")
	Date createdTms
	
	@Column(name="company_id")
	Integer companyId
	
	@Column(name="list_ident")
	String listId
	
	@Column(name="external_ident")
	String externalId
	
	@Column(name="display_index_next")
	int displayIndexNext


	@Override
	public String toString() {
		return "SaveableItemInternal [itemId=" + itemId + ", modTimestampTms=" + modTimestampTms + ", specialType=" \
				+ specialType + ", latestTargetId=" + latestTargetId + ", latestTargetDate=" + latestTargetDate \
				+ ", onHandQuantity=" + onHandQuantity + ", valueOnHand=" + valueOnHand + ", avgCost=" + avgCost \
				+ ", onOrder=" + onOrder + ", salesOrder=" + salesOrder + ", toBeBuilt=" + toBeBuilt \
				+ ", requiredByPendingBuild=" + requiredByPendingBuild + ", modifiedTms=" + modifiedTms \
				+ ", createdTms=" + createdTms + ", companyId=" + companyId + ", listId=" + listId + ", externalId=" \
				+ externalId + ", displayIndexNext=" + displayIndexNext + "]";
	}
}