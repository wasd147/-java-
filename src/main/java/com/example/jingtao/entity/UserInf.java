package com.example.jingtao.entity;

public class UserInf {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinf.openid
     *
     * @mbggenerated
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinf.nickname
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinf.head_img
     *
     * @mbggenerated
     */
    private String headImg;

    public UserInf() {
    }

    public UserInf(String openid, String nickname, String headImg) {
        this.openid = openid;
        this.nickname = nickname;
        this.headImg = headImg;
    }

    @Override
    public String toString() {
        return "UserInf{" +
                "openid='" + openid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", headImg='" + headImg + '\'' +
                '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinf.openid
     *
     * @return the value of userinf.openid
     *
     * @mbggenerated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinf.openid
     *
     * @param openid the value for userinf.openid
     *
     * @mbggenerated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinf.nickname
     *
     * @return the value of userinf.nickname
     *
     * @mbggenerated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinf.nickname
     *
     * @param nickname the value for userinf.nickname
     *
     * @mbggenerated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinf.head_img
     *
     * @return the value of userinf.head_img
     *
     * @mbggenerated
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinf.head_img
     *
     * @param headImg the value for userinf.head_img
     *
     * @mbggenerated
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }
}