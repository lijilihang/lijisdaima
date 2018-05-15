package com.etimeci.ssm.entity;

public class Answer {
    private Integer answerId;
    private String examId;
    private String type;
    private String value;
    private String questionNum;
    private Integer testId;



    public Integer getTestId() {
        return testId;
    }
    public void setTestId(Integer testId) {
        this.testId = testId;
    }
    public Integer getAnswerId() {
        return answerId;
    }
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }
    public String getExamId() {
        return examId;
    }
    public void setExamId(String examId) {
        this.examId = examId;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getQuestionNum() {
        return questionNum;
    }
    public void setQuestionNum(String questionNum) {
        this.questionNum = questionNum;
    }





}
