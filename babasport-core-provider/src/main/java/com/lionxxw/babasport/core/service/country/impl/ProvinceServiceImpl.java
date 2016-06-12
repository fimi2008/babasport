package com.lionxxw.babasport.core.service.country.impl;

import java.util.List;

import javax.annotation.Resource;

import com.lionxxw.babasport.core.dao.country.ProvinceDao;
import com.lionxxw.babasport.core.dto.country.Province;
import com.lionxxw.babasport.core.query.country.ProvinceQuery;
import com.lionxxw.babasport.core.service.country.ProvinceService;
import com.lionxxw.common.model.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 省
 * @author lixu
 * @Date [2014-3-27 下午03:31:57]
 */
@Service
@Transactional
public class ProvinceServiceImpl implements ProvinceService {

	@Resource
	ProvinceDao provinceDao;

	/**
	 * 插入数据库
	 * 
	 * @return
	 */
	public Integer addProvince(Province province) {
		return provinceDao.addProvince(province);
	}

	/**
	 * 根据主键查找
	 */
	@Transactional(readOnly = true)
	public Province getProvinceByKey(Integer id) {
		return provinceDao.getProvinceByKey(id);
	}
	
	@Transactional(readOnly = true)
	public List<Province> getProvincesByKeys(List<Integer> idList) {
		return provinceDao.getProvincesByKeys(idList);
	}

	/**
	 * 根据主键删除
	 * 
	 * @return
	 */
	public Integer deleteByKey(Integer id) {
		return provinceDao.deleteByKey(id);
	}

	public Integer deleteByKeys(List<Integer> idList) {
		return provinceDao.deleteByKeys(idList);
	}

	/**
	 * 根据主键更新
	 * 
	 * @return
	 */
	public Integer updateProvinceByKey(Province province) {
		return provinceDao.updateProvinceByKey(province);
	}
	
	@Transactional(readOnly = true)
	public PageResult<Province> getProvinceListWithPage(ProvinceQuery provinceQuery) {
		int total = provinceDao.getProvinceListCount(provinceQuery);
		if (total > 0){
			List<Province> list = provinceDao.getProvinceListWithPage(provinceQuery);
			return new PageResult<Province>(total, provinceQuery.getPageSize(), list);
		}
		return null;
	}
	
	@Transactional(readOnly = true)
	public List<Province> getProvinceList(ProvinceQuery provinceQuery) {
		return provinceDao.getProvinceList(provinceQuery);
	}
}
