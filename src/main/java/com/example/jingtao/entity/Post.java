package com.example.jingtao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.post_id
     *
     * @mbggenerated
     */
    private String postId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.openid
     *
     * @mbggenerated
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.school
     *
     * @mbggenerated
     */
    private String school;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.time
     *
     * @mbggenerated
     */
    private Date time;

    public Post(String postId, String openid, String school, String content, Date time) {
        this.postId = postId;
        this.openid = openid;
        this.school = school;
        this.content = content;
        this.time = time;
    }

    public PostPlus toPostPlus(List<PostImage> imageList) {
        ArrayList<String> list = new ArrayList<>();

        String url = "/post/getImg?postId=" + postId +"&imageId=";
        for (int i = 0; i < imageList.size(); i++) {
            list.add(url + imageList.get(i).getImageId());
        }
        return new PostPlus(postId, openid, school, content, time, list);
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId='" + postId + '\'' +
                ", openid='" + openid + '\'' +
                ", school='" + school + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.post_id
     *
     * @return the value of post.post_id
     * @mbggenerated
     */
    public String getPostId() {
        return postId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.post_id
     *
     * @param postId the value for post.post_id
     * @mbggenerated
     */
    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.openid
     *
     * @return the value of post.openid
     * @mbggenerated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.openid
     *
     * @param openid the value for post.openid
     * @mbggenerated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.school
     *
     * @return the value of post.school
     * @mbggenerated
     */
    public String getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.school
     *
     * @param school the value for post.school
     * @mbggenerated
     */
    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.content
     *
     * @return the value of post.content
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.content
     *
     * @param content the value for post.content
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.time
     *
     * @return the value of post.time
     * @mbggenerated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.time
     *
     * @param time the value for post.time
     * @mbggenerated
     */
    public void setTime(Date time) {
        this.time = time;
    }
}