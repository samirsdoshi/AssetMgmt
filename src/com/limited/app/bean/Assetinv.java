package com.limited.app.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Assetinv {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assetinv.id
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assetinv.assetid
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    private Integer assetid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assetinv.asofdate
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    private Date asofdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assetinv.amount
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    private BigDecimal amount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assetinv.id
     *
     * @return the value of assetinv.id
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assetinv.id
     *
     * @param id the value for assetinv.id
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assetinv.assetid
     *
     * @return the value of assetinv.assetid
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public Integer getAssetid() {
        return assetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assetinv.assetid
     *
     * @param assetid the value for assetinv.assetid
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public void setAssetid(Integer assetid) {
        this.assetid = assetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assetinv.asofdate
     *
     * @return the value of assetinv.asofdate
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public Date getAsofdate() {
        return asofdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assetinv.asofdate
     *
     * @param asofdate the value for assetinv.asofdate
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public void setAsofdate(Date asofdate) {
        this.asofdate = asofdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assetinv.amount
     *
     * @return the value of assetinv.amount
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assetinv.amount
     *
     * @param amount the value for assetinv.amount
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}