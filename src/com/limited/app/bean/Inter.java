package com.limited.app.bean;

public class Inter {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inter.id
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inter.inter_name
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    private String interName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inter.inter_desc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    private String interDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inter.id
     *
     * @return the value of inter.id
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inter.id
     *
     * @param id the value for inter.id
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inter.inter_name
     *
     * @return the value of inter.inter_name
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public String getInterName() {
        return interName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inter.inter_name
     *
     * @param interName the value for inter.inter_name
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public void setInterName(String interName) {
        this.interName = interName == null ? null : interName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inter.inter_desc
     *
     * @return the value of inter.inter_desc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public String getInterDesc() {
        return interDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inter.inter_desc
     *
     * @param interDesc the value for inter.inter_desc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public void setInterDesc(String interDesc) {
        this.interDesc = interDesc == null ? null : interDesc.trim();
    }
}