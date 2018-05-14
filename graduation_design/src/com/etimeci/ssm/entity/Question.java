package com.etimeci.ssm.entity;

import java.util.List;
import java.util.Map;

public class Question {
    private Integer qiestionId;
    private String type;
    private Integer index;
    private String title;
    private List<Map<String, String>> option;
    private String content;
    private Integer examId;
    private String examTitle;

    private String questionName;
    private String questionAnswer;
    private String questionCreateTime;
    private String optionString;




    public String getExamTitle() {
        return examTitle;
    }
    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }
    public String getOptionString() {
        return optionString;
    }
    public void setOptionString(String optionString) {
        this.optionString = optionString;
    }
    public Integer getQiestionId() {
        return qiestionId;
    }
    public void setQiestionId(Integer qiestionId) {
        this.qiestionId = qiestionId;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getIndex() {
        return index;
    }
    public void setIndex(Integer index) {
        this.index = index;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<Map<String, String>> getOption() {
        return option;
    }
    public void setOption(List<Map<String, String>> option) {
        this.option = option;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Integer getExamId() {
        return examId;
    }
    public void setExamId(Integer examId) {
        this.examId = examId;
    }
    public String getQuestionName() {
        return questionName;
    }
    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }
    public String getQuestionAnswer() {
        return questionAnswer;
    }
    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }
    public String getQuestionCreateTime() {
        return questionCreateTime;
    }
    public void setQuestionCreateTime(String questionCreateTime) {
        this.questionCreateTime = questionCreateTime;
    }
    @Override
    public String toString() {
        return "Question [qiestionId=" + qiestionId + ", type=" + type + ", index=" + index + ", title=" + title
                + ", option=" + option + ", content=" + content + ", examId=" + examId + ", questionName="
                + questionName + ", questionAnswer=" + questionAnswer + ", questionCreateTime=" + questionCreateTime
                + "]";
    }




}
