package org.example.doex.entity.vo;

import java.time.LocalDateTime;

public class UsersVO  {

    private Integer id;

    private String userName;

    private String password;

    private UserTypeVO userType;

    private IndustriesVO industry;

    private JobsVO job;

    private Integer questionNum;

    private LocalDateTime createTime;

    private String avatar;

    private String signature;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserTypeVO getUserType() {
        return userType;
    }

    public void setUserType(UserTypeVO userType) {
        this.userType = userType;
    }

    public IndustriesVO getIndustry() {
        return industry;
    }

    public void setIndustry(IndustriesVO industry) {
        this.industry = industry;
    }

    public JobsVO getJob() {
        return job;
    }

    public void setJob(JobsVO job) {
        this.job = job;
    }

    public Integer getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(Integer questionNum) {
        this.questionNum = questionNum;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "UsersVO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                ", industry=" + industry +
                ", job=" + job +
                ", questionNum=" + questionNum +
                ", createTime=" + createTime +
                ", avatar='" + avatar + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}
