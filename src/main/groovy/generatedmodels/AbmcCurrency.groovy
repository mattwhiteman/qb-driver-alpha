package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcCurrency generated by hbm2java
 */
@Entity
@Table(name = "abmc_currency")
public class AbmcCurrency implements java.io.Serializable {

	private int currencyId;
	private String name;
	private String code;
	private String symbol;
	private double currentRate;
	private int symbolPosition;
	private String decimalSeparator;
	private String separator;
	private String separatorGrouping;
	private int decimalPlaces;
	private byte isEmuBool;
	private byte isUserDefinedCurrencyBool;
	private Integer gainLossAccountId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private byte isHiddenBool;
	private byte isDeletedBool;
	private byte isDeletePendingBool;
	private Integer timestampTms;
	private Integer modtimestampTms;
	private String currencyAbmId;
	private Integer companyId;

	public AbmcCurrency() {
	}

	public AbmcCurrency(int currencyId, String name, double currentRate, int symbolPosition, int decimalPlaces,
			byte isEmuBool, byte isUserDefinedCurrencyBool, Date dbCreatedTms, Date dbModifiedTms, byte isHiddenBool,
			byte isDeletedBool, byte isDeletePendingBool, String currencyAbmId) {
		this.currencyId = currencyId;
		this.name = name;
		this.currentRate = currentRate;
		this.symbolPosition = symbolPosition;
		this.decimalPlaces = decimalPlaces;
		this.isEmuBool = isEmuBool;
		this.isUserDefinedCurrencyBool = isUserDefinedCurrencyBool;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.isHiddenBool = isHiddenBool;
		this.isDeletedBool = isDeletedBool;
		this.isDeletePendingBool = isDeletePendingBool;
		this.currencyAbmId = currencyAbmId;
	}

	public AbmcCurrency(int currencyId, String name, String code, String symbol, double currentRate, int symbolPosition,
			String decimalSeparator, String separator, String separatorGrouping, int decimalPlaces, byte isEmuBool,
			byte isUserDefinedCurrencyBool, Integer gainLossAccountId, Date dbCreatedTms, Date dbModifiedTms,
			byte isHiddenBool, byte isDeletedBool, byte isDeletePendingBool, Integer timestampTms,
			Integer modtimestampTms, String currencyAbmId, Integer companyId) {
		this.currencyId = currencyId;
		this.name = name;
		this.code = code;
		this.symbol = symbol;
		this.currentRate = currentRate;
		this.symbolPosition = symbolPosition;
		this.decimalSeparator = decimalSeparator;
		this.separator = separator;
		this.separatorGrouping = separatorGrouping;
		this.decimalPlaces = decimalPlaces;
		this.isEmuBool = isEmuBool;
		this.isUserDefinedCurrencyBool = isUserDefinedCurrencyBool;
		this.gainLossAccountId = gainLossAccountId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.isHiddenBool = isHiddenBool;
		this.isDeletedBool = isDeletedBool;
		this.isDeletePendingBool = isDeletePendingBool;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
		this.currencyAbmId = currencyAbmId;
		this.companyId = companyId;
	}

	@Id

	@Column(name = "currency_id", unique = true, nullable = false)
	public int getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	@Column(name = "name", nullable = false, length = 65)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "code", length = 17)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "symbol", length = 17)
	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Column(name = "current_rate", nullable = false, precision = 22, scale = 0)
	public double getCurrentRate() {
		return this.currentRate;
	}

	public void setCurrentRate(double currentRate) {
		this.currentRate = currentRate;
	}

	@Column(name = "symbol_position", nullable = false)
	public int getSymbolPosition() {
		return this.symbolPosition;
	}

	public void setSymbolPosition(int symbolPosition) {
		this.symbolPosition = symbolPosition;
	}

	@Column(name = "decimal_separator", length = 2)
	public String getDecimalSeparator() {
		return this.decimalSeparator;
	}

	public void setDecimalSeparator(String decimalSeparator) {
		this.decimalSeparator = decimalSeparator;
	}

	@Column(name = "separator", length = 2)
	public String getSeparator() {
		return this.separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

	@Column(name = "separator_grouping", length = 33)
	public String getSeparatorGrouping() {
		return this.separatorGrouping;
	}

	public void setSeparatorGrouping(String separatorGrouping) {
		this.separatorGrouping = separatorGrouping;
	}

	@Column(name = "decimal_places", nullable = false)
	public int getDecimalPlaces() {
		return this.decimalPlaces;
	}

	public void setDecimalPlaces(int decimalPlaces) {
		this.decimalPlaces = decimalPlaces;
	}

	@Column(name = "is_EMU_bool", nullable = false)
	public byte getIsEmuBool() {
		return this.isEmuBool;
	}

	public void setIsEmuBool(byte isEmuBool) {
		this.isEmuBool = isEmuBool;
	}

	@Column(name = "is_user_defined_currency_bool", nullable = false)
	public byte getIsUserDefinedCurrencyBool() {
		return this.isUserDefinedCurrencyBool;
	}

	public void setIsUserDefinedCurrencyBool(byte isUserDefinedCurrencyBool) {
		this.isUserDefinedCurrencyBool = isUserDefinedCurrencyBool;
	}

	@Column(name = "gain_loss_account_id")
	public Integer getGainLossAccountId() {
		return this.gainLossAccountId;
	}

	public void setGainLossAccountId(Integer gainLossAccountId) {
		this.gainLossAccountId = gainLossAccountId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_created_tms", nullable = false, length = 19)
	public Date getDbCreatedTms() {
		return this.dbCreatedTms;
	}

	public void setDbCreatedTms(Date dbCreatedTms) {
		this.dbCreatedTms = dbCreatedTms;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_modified_tms", nullable = false, length = 19)
	public Date getDbModifiedTms() {
		return this.dbModifiedTms;
	}

	public void setDbModifiedTms(Date dbModifiedTms) {
		this.dbModifiedTms = dbModifiedTms;
	}

	@Column(name = "is_hidden_bool", nullable = false)
	public byte getIsHiddenBool() {
		return this.isHiddenBool;
	}

	public void setIsHiddenBool(byte isHiddenBool) {
		this.isHiddenBool = isHiddenBool;
	}

	@Column(name = "is_deleted_bool", nullable = false)
	public byte getIsDeletedBool() {
		return this.isDeletedBool;
	}

	public void setIsDeletedBool(byte isDeletedBool) {
		this.isDeletedBool = isDeletedBool;
	}

	@Column(name = "is_delete_pending_bool", nullable = false)
	public byte getIsDeletePendingBool() {
		return this.isDeletePendingBool;
	}

	public void setIsDeletePendingBool(byte isDeletePendingBool) {
		this.isDeletePendingBool = isDeletePendingBool;
	}

	@Column(name = "timestamp_tms")
	public Integer getTimestampTms() {
		return this.timestampTms;
	}

	public void setTimestampTms(Integer timestampTms) {
		this.timestampTms = timestampTms;
	}

	@Column(name = "modtimestamp_tms")
	public Integer getModtimestampTms() {
		return this.modtimestampTms;
	}

	public void setModtimestampTms(Integer modtimestampTms) {
		this.modtimestampTms = modtimestampTms;
	}

	@Column(name = "currency_abm_id", nullable = false, length = 17)
	public String getCurrencyAbmId() {
		return this.currencyAbmId;
	}

	public void setCurrencyAbmId(String currencyAbmId) {
		this.currencyAbmId = currencyAbmId;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
