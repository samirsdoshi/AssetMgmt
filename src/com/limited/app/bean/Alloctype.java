package com.limited.app.bean;

public class Alloctype {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alloctype.id
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alloctype.description
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alloctype.id
     *
     * @return the value of alloctype.id
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alloctype.id
     *
     * @param id the value for alloctype.id
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alloctype.description
     *
     * @return the value of alloctype.description
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alloctype.description
     *
     * @param description the value for alloctype.description
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}