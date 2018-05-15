package com.etimeci.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.etimeci.ssm.entity.Answer;
import com.etimeci.ssm.entity.Exam;
import com.etimeci.ssm.entity.Question;
import com.etimeci.ssm.entity.TestScore;
import com.etimeci.ssm.entity.UserMessage;

public interface SolutionDao {
    public Boolean insertExamMessage(Exam exam);
    public List<UserMessage> selectExamList(Integer founderId);
    public  Boolean insertQuestionList(List<Question> list);
    public List<Question> selectQuestionList(@Param("examId")Integer examId, @Param("offset")Integer offset, @Param("pageSize")Integer pageSize);
    public Boolean updteExamById(@Param("examId")String examId);
    public Boolean insertAnswerMessage(List<Answer> list);
    public Boolean insertTestMessage(TestScore testScore);
    public List<TestScore> selectTestId(@Param("testId")Integer testId);
}
