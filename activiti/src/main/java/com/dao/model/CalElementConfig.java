package com.dao.model;

public class CalElementConfig {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pe_cal_config.Id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pe_cal_config.CAL_PROPERTY
	 * @mbggenerated
	 */
	private String calProperty;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pe_cal_config.TABLE_SOURCE
	 * @mbggenerated
	 */
	private String tableSource;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pe_cal_config.TABLE_COLUMN
	 * @mbggenerated
	 */
	private String tableColumn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pe_cal_config.calType
	 * @mbggenerated
	 */
	private String caltype;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pe_cal_config.Id
	 * @return  the value of pe_cal_config.Id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pe_cal_config.Id
	 * @param id  the value for pe_cal_config.Id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pe_cal_config.CAL_PROPERTY
	 * @return  the value of pe_cal_config.CAL_PROPERTY
	 * @mbggenerated
	 */
	public String getCalProperty() {
		return calProperty;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pe_cal_config.CAL_PROPERTY
	 * @param calProperty  the value for pe_cal_config.CAL_PROPERTY
	 * @mbggenerated
	 */
	public void setCalProperty(String calProperty) {
		this.calProperty = calProperty;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pe_cal_config.TABLE_SOURCE
	 * @return  the value of pe_cal_config.TABLE_SOURCE
	 * @mbggenerated
	 */
	public String getTableSource() {
		return tableSource;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pe_cal_config.TABLE_SOURCE
	 * @param tableSource  the value for pe_cal_config.TABLE_SOURCE
	 * @mbggenerated
	 */
	public void setTableSource(String tableSource) {
		this.tableSource = tableSource;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pe_cal_config.TABLE_COLUMN
	 * @return  the value of pe_cal_config.TABLE_COLUMN
	 * @mbggenerated
	 */
	public String getTableColumn() {
		return tableColumn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pe_cal_config.TABLE_COLUMN
	 * @param tableColumn  the value for pe_cal_config.TABLE_COLUMN
	 * @mbggenerated
	 */
	public void setTableColumn(String tableColumn) {
		this.tableColumn = tableColumn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pe_cal_config.calType
	 * @return  the value of pe_cal_config.calType
	 * @mbggenerated
	 */
	public String getCaltype() {
		return caltype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pe_cal_config.calType
	 * @param caltype  the value for pe_cal_config.calType
	 * @mbggenerated
	 */
	public void setCaltype(String caltype) {
		this.caltype = caltype;
	}
}