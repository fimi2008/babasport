package com.lionxxw.babasport.core.dao.country;

import com.lionxxw.babasport.core.dto.country.Town;
import com.lionxxw.babasport.core.query.country.TownQuery;

import java.util.List;


public interface TownDao {

	/**
	 * 添加
	 * @param town
	 */
	Integer addTown(Town town);

	/**
	 * 根据主键查找
	 */
	Town getTownByKey(Integer id);

	/**
	 * 根据主键批量查找
	 */
	List<Town> getTownsByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 */
	Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 */
	Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 */
	Integer updateTownByKey(Town town);

	/**
	 * 分页查询
	 * @param townQuery
	 */
	List<Town> getTownListWithPage(TownQuery townQuery);

	/**
	 * 集合查询
	 * @param townQuery
	 */
	List<Town> getTownList(TownQuery townQuery);
	
	/**
	 * 总条数
	 * @param townQuery
	 */
	int getTownListCount(TownQuery townQuery);
}
