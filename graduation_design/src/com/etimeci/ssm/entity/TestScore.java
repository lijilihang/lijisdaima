package com.etimeci.ssm.entity;

public class TestScore {
    private Integer testId;
    private Float testScore;
    private String testDate;
    private Integer examId;
    private Integer userId;
    private Integer total;



    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public String getTestDate() {
        return testDate;
    }
    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }
    public Integer getTestId() {
        return testId;
    }
    public void setTestId(Integer testId) {
        this.testId = testId;
    }
    public Float getTestScore() {
        return testScore;
    }
    public void setTestScore(Float testScore) {
        this.testScore = testScore;
    }
    public Integer getExamId() {
        return examId;
    }
    public void setExamId(Integer examId) {
        this.examId = examId;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }




}
