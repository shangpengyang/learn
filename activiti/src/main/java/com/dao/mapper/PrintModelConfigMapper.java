package com.dao.mapper;

import com.dao.model.PrintModelConfig;

public interface PrintModelConfigMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table print_model_config
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table print_model_config
	 * @mbggenerated
	 */
	int insert(PrintModelConfig record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table print_model_config
	 * @mbggenerated
	 */
	int insertSelective(PrintModelConfig record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table print_model_config
	 * @mbggenerated
	 */
	PrintModelConfig selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table print_model_config
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(PrintModelConfig record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table print_model_config
	 * @mbggenerated
	 */
	int updateByPrimaryKey(PrintModelConfig record);
}