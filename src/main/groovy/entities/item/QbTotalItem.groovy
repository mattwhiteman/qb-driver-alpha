package entities.item

import org.hibernate.annotations.NotFound
import org.hibernate.annotations.NotFoundAction

import javax.persistence.*

// Single model class that is comprised of all the item data from the user and internal table
@Entity
@Table(name="QBAdminGroup.abmc_item_user")
@SecondaryTable(name="QbAdminGroup.abmc_item_internal", pkJoinColumns=@PrimaryKeyJoinColumn(name="item_id", referencedColumnName="item_id") )
public class QbTotalItem
{
	@Id
	@Column(name="item_id")
	int itemId

	@Column(name="name")
	String name
	
	@Column(name="is_hidden_bool")
	boolean isActive
	
	@Column(name="is_deleted_bool")
	boolean isDeleted
	
	@Column(name="sales_tax_code_id")
	Integer salesTaxCodeId

	@Column(name="asset_account_id")
	Integer assetAccountId
	
	@Column(name="cogs_account_id")
	Integer cogsAccountId
	
	@Column(name="post_account_id")
	Integer postAccountId
	
	@Column(name="preferred_vendor_id")
	Integer preferredVendorId
	
	@Column(name="tax_agency_id")
	Integer taxAgencyId
	
	@Column(name="parent_id")
	Integer categoryId
	
	@Column(name="item_type")
	Integer itemType
	
	@Column(name="sales_price_amt")
	BigDecimal price
	
	@Column(name="reorder_inventory_qnty")
	Integer reorderPoint
	
	@Column(name="unit_cost_amt")
	BigDecimal cost

	@Column(name="accumulated_depreciation_amt")
	BigDecimal accumulatedDepreciation

	@Column(name="item_abm_id")
	String itemAbmId
	
	@Column(name="manufacturer_part_num")
	String mpn
	
	@JoinColumn(name="parent_id", insertable = false, updatable = false)
	@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE)
	QbTotalItem parentItem
	
	@Column(name="description")
	String description

	@Column(name="purchase_description")
	String purchaseDescription
	
	@Column(name="on_hand_qnty", table="QbAdminGroup.abmc_item_internal")
	BigDecimal onHandQuantity
}