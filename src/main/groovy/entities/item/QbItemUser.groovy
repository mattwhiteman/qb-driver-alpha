package entities.item

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

// Corresponds to the abmc_item_user table. This class was created by hand, but should have the same fields and
// functionality as AbmcItemUser
@Entity
@Table(name="QBAdminGroup.abmc_item_user")
public class QbItemUser
{
	@Id
	@Column(name="item_id")
	int itemId
	
	@Column(name="timestamp_tms")
	int timestampTms
	
	@Column(name="modtimestamp_tms")
	int modTimestampTms
	
	@Column(name="name")
	String name
	
	@Column(name="is_hidden_bool")
	boolean isActive
	
	@Column(name="is_deleted_bool")
	boolean isDeleted
	
	@Column(name="is_delete_pending_bool")
	boolean isDeletePending

	@Column(name="sales_tax_code_id")
	Integer salesTaxCodeId
	
	@Column(name="asset_account_id")
	Integer assetAccountId
	
	@Column(name="cogs_account_id")
	Integer cogsAccountId
	
	@Column(name="post_account_id")
	Integer postAccountId
	
	@Column(name="payment_method_id")
	int paymentMethodId
	
	@Column(name="preferred_vendor_id")
	Integer preferredVendorId
	
	@Column(name="tax_agency_id")
	Integer taxAgencyId
	
	@Column(name="attributes_id")
	int attributesId
	
	@Column(name="parent_id")
	Integer categoryId
	
	@Column(name="sublevel")
	int subLevel
	
	@Column(name="item_type")
	Integer itemType
	
	@Column(name="print_grouped_bool")
	boolean printGrouped
	
	@Column(name="is_group_bool")
	boolean isGroup
	
	@Column(name="is_pass_thru_bool")
	boolean isPassThrough
	
	@Column(name="deposit_type")
	int depositType
	
	@Column(name="was_imported_bool")
	boolean wasImported
	
	@Column(name="sales_price_amt")
	BigDecimal price
	
	@Column(name="sales_price_pct")
	BigDecimal pricePct
	
	@Column(name="num_grouped_items")
	int numGroupedItems
	
	@Column(name="reorder_point_qnty")
	Integer reorderPoint
	
	@Column(name="unit_cost_amt")
	BigDecimal cost

	@Column(name="unit_cost_qnty")
	BigDecimal costQty
	
	@Column(name="sales_price_qnty")
	BigDecimal priceQty
	
	@Column(name="assembly_build_point_qnty")
	BigDecimal assemblyBuildPtQty
	
	@Column(name="purchase_date")
	Date purchaseDate
	
	@Column(name="sale_date")
	Date saleDate
	
	@Column(name="warranty_expire_date")
	Date warrantyExpireDate
	
	@Column(name="is_new_bool")
	boolean isNew
	
	@Column(name="cost_basis_amt")
	BigDecimal costBasis

	@Column(name="accumulated_depreciation_amt")
	BigDecimal accumulatedDepreciation
	
	@Column(name="book_value_amt")
	BigDecimal bookValue
	
	@Column(name="sale_expense_amt")
	BigDecimal salesExpense

	@Column(name="item_abm_id")
	String itemAbmId
	
	@Column(name="asset_manager_num")
	String assetMgrNumber
	
	@Column(name="po_num")
	String poNumber
	
	@Column(name="serial_num")
	String serialNumber
	
	@Column(name="purchase_description2")
	String purchaseDescription2
	
	@Column(name="location")
	String location
	
	@Column(name="vendor_MFG")
	String vendorMfg
	
	@Column(name="manufacturer_part_num")
	String mpn
	
	@Column(name="db_modified_tms")
	Date modifiedTms
	
	@Column(name="db_created_tms")
	Date createdTms
	
	@Column(name="description")
	String description

	@Column(name="purchase_description")
	String purchaseDescription
	
	@Column(name="notes")
	String notes
	
	@Column(name="company_id")
	Integer companyId
	
	@Column(name="is_amt_incl_tax_bool")
	boolean amtIncludesTax
	
	@Column(name="sales_tax_return_line_num")
	int salesTaxReturnLineNumber
	
	@Column(name="purchase_tax_code_id")
	int purchaseTaxCodeId
	
	@Column(name="gross_sales_price_amt")
	BigDecimal grossSalesPrice
	
	@Column(name="gross_sales_price_pct")
	BigDecimal grossSalesPricePct
	
	@Column(name="gross_sales_price_qnty")
	BigDecimal grossSalesPriceQty
	
	@Column(name="gross_unit_price_amt")
	BigDecimal grossUnitPrice
	
	@Column(name="gross_unit_price_qnty")
	BigDecimal grossUnitPriceQty
	
	@Column(name="is_used_on_purchase_trans_bool")
	boolean isUsedOnPurchaseTrans
	
	@Column(name="unit_set_id")
	Integer unitSetId
	
	@Column(name="external_ident")
	String externalId
	
	@Column(name="has_attachments_bool")
	boolean hasAttachments
	
	@Column(name="markup_amt")
	BigDecimal markup
	
	@Column(name="markup_pct")
	BigDecimal markupPct
	
	@Column(name="action_markup")
	Integer actionMarkup
	
	@Column(name="action_if_sn_non_unique")
	Integer actionIfSnNonUnique
	
	@Column(name="action_if_sn_missing")
	Integer actionIfSnMissing
	
	@Column(name="action_if_sn_not_available")
	Integer actionIfSnNotAvail
	
	@Column(name="action_if_exp_date_blank")
	Integer actionIfExpDateBlank
	
	@Column(name="class_id")
	Integer classId
	
	@Column(name="reorder_inventory_qnty")
	BigDecimal reorderQty
	
	@Column(name="reorder_assembly_qnty")
	BigDecimal reorderAssemblyQty
	
	@Column(name="before_override_unit_cost_amt")
	BigDecimal unitCostBeforeOverride
	
	@Column(name="pref_cost_override")
	Integer prefCostOverride
	
	@Column(name="pref_assembly_markup")
	Integer prefAssemblyMarkup
	
	@Column(name="subtotal_fields")
	Integer subTotalFields
	
	@Column(name="subtotal_fields_multiplier")
	Integer subtotalFieldsMultiplier

	@Override
	public String toString() {
		return "SaveableItemUser [itemId=" + itemId + ", timestampTms=" + timestampTms + ", modTimestampTms=" \
				+ modTimestampTms + ", name=" + name + ", isActive=" + isActive + ", isDeleted=" + isDeleted \
				+ ", isDeletePending=" + isDeletePending + ", salesTaxCodeId=" + salesTaxCodeId + ", assetAccountId=" \
				+ assetAccountId + ", cogsAccountId=" + cogsAccountId + ", postAccountId=" + postAccountId \
				+ ", paymentMethodId=" + paymentMethodId + ", preferredVendorId=" + preferredVendorId + ", taxAgencyId=" \
				+ taxAgencyId + ", attributesId=" + attributesId + ", categoryId=" + categoryId + ", subLevel=" \
				+ subLevel + ", itemType=" + itemType + ", printGrouped=" + printGrouped + ", isGroup=" + isGroup \
				+ ", isPassThrough=" + isPassThrough + ", depositType=" + depositType + ", wasImported=" + wasImported \
				+ ", price=" + price + ", pricePct=" + pricePct + ", numGroupedItems=" + numGroupedItems \
				+ ", reorderPoint=" + reorderPoint + ", cost=" + cost + ", costQty=" + costQty + ", priceQty=" \
				+ priceQty + ", assemblyBuildPtQty=" + assemblyBuildPtQty + ", purchaseDate=" + purchaseDate \
				+ ", saleDate=" + saleDate + ", warrantyExpireDate=" + warrantyExpireDate + ", isNew=" + isNew \
				+ ", costBasis=" + costBasis + ", accumulatedDepreciation=" + accumulatedDepreciation + ", bookValue=" \
				+ bookValue + ", salesExpense=" + salesExpense + ", itemAbmId=" + itemAbmId + ", assetMgrNumber=" \
				+ assetMgrNumber + ", poNumber=" + poNumber + ", serialNumber=" + serialNumber \
				+ ", purchaseDescription2=" + purchaseDescription2 + ", location=" + location + ", vendorMfg=" \
				+ vendorMfg + ", mpn=" + mpn + ", modifiedTms=" + modifiedTms + ", createdTms=" + createdTms \
				+ ", description=" + description + ", purchaseDescription=" + purchaseDescription + ", notes=" + notes \
				+ ", companyId=" + companyId + ", amtIncludesTax=" + amtIncludesTax + ", salesTaxReturnLineNumber=" \
				+ salesTaxReturnLineNumber + ", purchaseTaxCodeId=" + purchaseTaxCodeId + ", grossSalesPrice=" \
				+ grossSalesPrice + ", grossSalesPricePct=" + grossSalesPricePct + ", grossSalesPriceQty=" \
				+ grossSalesPriceQty + ", grossUnitPrice=" + grossUnitPrice + ", grossUnitPriceQty=" + grossUnitPriceQty \
				+ ", isUsedOnPurchaseTrans=" + isUsedOnPurchaseTrans + ", unitSetId=" + unitSetId + ", externalId=" \
				+ externalId + ", hasAttachments=" + hasAttachments + ", markup=" + markup + ", markupPct=" + markupPct \
				+ ", actionMarkup=" + actionMarkup + ", actionIfSnNonUnique=" + actionIfSnNonUnique \
				+ ", actionIfSnMissing=" + actionIfSnMissing + ", actionIfSnNotAvail=" + actionIfSnNotAvail \
				+ ", actionIfExpDateBlank=" + actionIfExpDateBlank + ", classId=" + classId + ", reorderQty=" \
				+ reorderQty + ", reorderAssemblyQty=" + reorderAssemblyQty + ", unitCostBeforeOverride=" \
				+ unitCostBeforeOverride + ", prefCostOverride=" + prefCostOverride + ", prefAssemblyMarkup=" \
				+ prefAssemblyMarkup + ", subTotalFields=" + subTotalFields + ", subtotalFieldsMultiplier=" \
				+ subtotalFieldsMultiplier + "]";
	}
}