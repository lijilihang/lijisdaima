package com.etimeci.ssm.service;

import java.util.List;

import com.etimeci.ssm.entity.Exam;
import com.etimeci.ssm.entity.Question;
import com.etimeci.ssm.entity.UserMessage;

public interface SolutionService {
    public Boolean insertExamMessage(Exam exam);
    public List<UserMessage> selectExamList(Integer founderId);
    public  Boolean insertQuestionList(List<Question> list);
    public List<Question> selectQuestionList(Integer examId, Integer offset, Integer pageSize);
    public Boolean updteExamById(String examId);
}
