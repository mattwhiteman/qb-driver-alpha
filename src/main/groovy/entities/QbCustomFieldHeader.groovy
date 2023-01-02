package entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="QbAdminGroup.abmc_custom_field_type")
public class QbCustomFieldHeader
{
	@Id
	@Column(name="custom_field_type_id")
	int fieldId
	
	@Column(name="custom_field_position")
	int fieldPosition
	
	@Column(name="custom_field_name")
	String name
	
	@Column(name="is_for_item_bool")
	boolean isItemField
	
	@Column(name="is_for_customer_bool")
	boolean isCustomField
	
	@Column(name="is_for_vendor_bool")
	boolean isVendorField
	
	@Column(name="is_for_employee_bool")
	boolean isEmployeeField


	@Override
	public String toString() {
		return "QbCustomFieldHeader [fieldId=" + fieldId + ", fieldPosition=" + fieldPosition + ", name=" + name \
				+ ", isItemField=" + isItemField + ", isCustomField=" + isCustomField + ", isVendorField=" \
				+ isVendorField + ", isEmployeeField=" + isEmployeeField + "]";
	}
	
	
}