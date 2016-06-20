package com.lionxxw.babasport.product.mapper;

import com.lionxxw.babasport.product.entity.Material;
import com.lionxxw.babasport.product.entity.MaterialExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_material
     *
     * @mbggenerated Thu Jun 02 11:07:18 CST 2016
     */
    int countByExample(MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_material
     *
     * @mbggenerated Thu Jun 02 11:07:18 CST 2016
     */
    int deleteByExample(MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_material
     *
     * @mbggenerated Thu Jun 02 11:07:18 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_material
     *
     * @mbggenerated Thu Jun 02 11:07:18 CST 2016
     */
    int insert(Material record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_material
     *
     * @mbggenerated Thu Jun 02 11:07:18 CST 2016
     */
    int insertSelective(Material record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_material
     *
     * @mbggenerated Thu Jun 02 11:07:18 CST 2016
     */
    List<Material> selectByExample(MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_material
     *
     * @mbggenerated Thu Jun 02 11:07:18 CST 2016
     */
    Material selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_material
     *
     * @mbggenerated Thu Jun 02 11:07:18 CST 2016
     */
    int updateByExampleSelective(@Param("record") Material record, @Param("example") MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_material
     *
     * @mbggenerated Thu Jun 02 11:07:18 CST 2016
     */
    int updateByExample(@Param("record") Material record, @Param("example") MaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_material
     *
     * @mbggenerated Thu Jun 02 11:07:18 CST 2016
     */
    int updateByPrimaryKeySelective(Material record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_material
     *
     * @mbggenerated Thu Jun 02 11:07:18 CST 2016
     */
    int updateByPrimaryKey(Material record);
}