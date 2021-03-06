package com.limited.app.db.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.limited.app.bean.Asset;
import com.limited.app.bean.AssetExample;

public interface AssetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int countByExample(AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int deleteByExample(AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int insert(Asset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int insertSelective(Asset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    List<Asset> selectByExample(AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    Asset selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int updateByExampleSelective(@Param("record") Asset record, @Param("example") AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int updateByExample(@Param("record") Asset record, @Param("example") AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int updateByPrimaryKeySelective(Asset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int updateByPrimaryKey(Asset record);
}