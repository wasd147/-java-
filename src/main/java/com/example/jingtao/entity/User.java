package com.example.jingtao.entity;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.openid
     *
     * @mbggenerated
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.school
     *
     * @mbggenerated
     */
    private String school;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.college
     *
     * @mbggenerated
     */
    private String college;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.major
     *
     * @mbggenerated
     */
    private String major;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.grade
     *
     * @mbggenerated
     */
    private Integer grade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.banji
     *
     * @mbggenerated
     */
    private String banji;

    public User(String openid, String school, String college, String major, Integer grade, String banji) {
        this.openid = openid;
        this.school = school;
        this.college = college;
        this.major = major;
        this.grade = grade;
        this.banji = banji;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.openid
     *
     * @return the value of user.openid
     *
     * @mbggenerated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.openid
     *
     * @param openid the value for user.openid
     *
     * @mbggenerated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.school
     *
     * @return the value of user.school
     *
     * @mbggenerated
     */
    public String getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.school
     *
     * @param school the value for user.school
     *
     * @mbggenerated
     */
    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.college
     *
     * @return the value of user.college
     *
     * @mbggenerated
     */
    public String getCollege() {
        return college;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.college
     *
     * @param college the value for user.college
     *
     * @mbggenerated
     */
    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.major
     *
     * @return the value of user.major
     *
     * @mbggenerated
     */
    public String getMajor() {
        return major;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.major
     *
     * @param major the value for user.major
     *
     * @mbggenerated
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.grade
     *
     * @return the value of user.grade
     *
     * @mbggenerated
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.grade
     *
     * @param grade the value for user.grade
     *
     * @mbggenerated
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.banji
     *
     * @return the value of user.banji
     *
     * @mbggenerated
     */
    public String getBanji() {
        return banji;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.banji
     *
     * @param banji the value for user.banji
     *
     * @mbggenerated
     */
    public void setBanji(String banji) {
        this.banji = banji == null ? null : banji.trim();
    }
}