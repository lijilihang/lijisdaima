package com.etimeci.ssm.service;

import java.util.List;

import com.etimeci.ssm.entity.Answer;
import com.etimeci.ssm.entity.Exam;
import com.etimeci.ssm.entity.Question;
import com.etimeci.ssm.entity.TestScore;
import com.etimeci.ssm.entity.UserMessage;

public interface SolutionService {
    public Boolean insertExamMessage(Exam exam);
    public List<UserMessage> selectExamList(Integer founderId);
    public  Boolean insertQuestionList(List<Question> list);
    public List<Question> selectQuestionList(Integer examId, Integer offset, Integer pageSize);
    public Boolean updteExamById(String examId);
    public Boolean insertAnswerMessage(List<Answer> list);
    public Boolean insertTestMessage(TestScore testScore);
    public List<TestScore> selectTestId(Integer testId);
    public int selectEveryOptionNum(String type, Integer questionNum, Integer examId, Integer optionNum);
    public int selectEveryCheckboxOptionNum(String type, Integer questionNum, Integer examId, String optionNum);
}
