package com.dao.mapper;

import com.dao.model.CalElementConfig;

public interface CalElementConfigMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pe_cal_config
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pe_cal_config
	 * @mbggenerated
	 */
	int insert(CalElementConfig record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pe_cal_config
	 * @mbggenerated
	 */
	int insertSelective(CalElementConfig record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pe_cal_config
	 * @mbggenerated
	 */
	CalElementConfig selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pe_cal_config
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(CalElementConfig record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pe_cal_config
	 * @mbggenerated
	 */
	int updateByPrimaryKey(CalElementConfig record);
}