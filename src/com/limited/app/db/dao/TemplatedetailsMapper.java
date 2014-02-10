package com.limited.app.db.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.limited.app.bean.Templatedetails;
import com.limited.app.bean.TemplatedetailsExample;

public interface TemplatedetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table templatedetails
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int countByExample(TemplatedetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table templatedetails
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int deleteByExample(TemplatedetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table templatedetails
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table templatedetails
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int insert(Templatedetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table templatedetails
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int insertSelective(Templatedetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table templatedetails
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    List<Templatedetails> selectByExample(TemplatedetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table templatedetails
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    Templatedetails selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table templatedetails
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int updateByExampleSelective(@Param("record") Templatedetails record, @Param("example") TemplatedetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table templatedetails
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int updateByExample(@Param("record") Templatedetails record, @Param("example") TemplatedetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table templatedetails
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int updateByPrimaryKeySelective(Templatedetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table templatedetails
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    int updateByPrimaryKey(Templatedetails record);
}