package com.etimeci.ssm.entity;

public class Exam {
    private Integer examId;
    private String examName;
    private String examTitle;
    private String examNumber;
    private String examTotalTime;
    private String examBeginTime;
    private String examEndTime;
    private String examCreateBy;
    private Float examScore;
    private String examDescription;
    private Integer founderId;
    private Integer viewCount;
    private Integer responseCount;
    private String examCreateTime;



    public String getExamCreateTime() {
        return examCreateTime;
    }
    public void setExamCreateTime(String examCreateTime) {
        this.examCreateTime = examCreateTime;
    }
    public Integer getExamId() {
        return examId;
    }
    public void setExamId(Integer examId) {
        this.examId = examId;
    }
    public String getExamName() {
        return examName;
    }
    public void setExamName(String examName) {
        this.examName = examName;
    }
    public String getExamTitle() {
        return examTitle;
    }
    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }
    public String getExamNumber() {
        return examNumber;
    }
    public void setExamNumber(String examNumber) {
        this.examNumber = examNumber;
    }
    public String getExamTotalTime() {
        return examTotalTime;
    }
    public void setExamTotalTime(String examTotalTime) {
        this.examTotalTime = examTotalTime;
    }
    public String getExamBeginTime() {
        return examBeginTime;
    }
    public void setExamBeginTime(String examBeginTime) {
        this.examBeginTime = examBeginTime;
    }
    public String getExamEndTime() {
        return examEndTime;
    }
    public void setExamEndTime(String examEndTime) {
        this.examEndTime = examEndTime;
    }
    public String getExamCreateBy() {
        return examCreateBy;
    }
    public void setExamCreateBy(String examCreateBy) {
        this.examCreateBy = examCreateBy;
    }
    public Float getExamScore() {
        return examScore;
    }
    public void setExamScore(Float examScore) {
        this.examScore = examScore;
    }
    public String getExamDescription() {
        return examDescription;
    }
    public void setExamDescription(String examDescription) {
        this.examDescription = examDescription;
    }
    public Integer getFounderId() {
        return founderId;
    }
    public void setFounderId(Integer founderId) {
        this.founderId = founderId;
    }
    public Integer getViewCount() {
        return viewCount;
    }
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }
    public Integer getResponseCount() {
        return responseCount;
    }
    public void setResponseCount(Integer responseCount) {
        this.responseCount = responseCount;
    }
    @Override
    public String toString() {
        return "Exam [examId=" + examId + ", examName=" + examName + ", examTitle=" + examTitle + ", examNumber="
                + examNumber + ", examTotalTime=" + examTotalTime + ", examBeginTime=" + examBeginTime
                + ", examEndTime=" + examEndTime + ", examCreateBy=" + examCreateBy + ", examScore=" + examScore
                + ", examDescription=" + examDescription + ", founderId=" + founderId + ", viewCount=" + viewCount
                + ", responseCount=" + responseCount + ", examCreateTime=" + examCreateTime + ", getExamCreateTime()="
                + getExamCreateTime() + ", getExamId()=" + getExamId() + ", getExamName()=" + getExamName()
                + ", getExamTitle()=" + getExamTitle() + ", getExamNumber()=" + getExamNumber()
                + ", getExamTotalTime()=" + getExamTotalTime() + ", getExamBeginTime()=" + getExamBeginTime()
                + ", getExamEndTime()=" + getExamEndTime() + ", getExamCreateBy()=" + getExamCreateBy()
                + ", getExamScore()=" + getExamScore() + ", getExamDescription()=" + getExamDescription()
                + ", getFounderId()=" + getFounderId() + ", getViewCount()=" + getViewCount() + ", getResponseCount()="
                + getResponseCount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }




}
