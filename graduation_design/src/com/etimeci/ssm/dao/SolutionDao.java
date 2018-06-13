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
    public int selectEveryOptionNum(@Param("type")String type, @Param("questionNum")Integer questionNum, @Param("examId")Integer examId, @Param("optionNum")Integer optionNum);
    public int selectEveryCheckboxOptionNum(@Param("type")String type, @Param("questionNum")Integer questionNum, @Param("examId")Integer examId, @Param("optionNum")String optionNum);
    public List<TestScore> selectTestScoreTotal(@Param("examId")Integer examId);
    public int selectMaxScore(@Param("examId")Integer examId);
    public int selectScoreCount(@Param("examId") Integer examId, @Param("stratScore") Float stratScore, @Param("endScore") Float endScore);
    public Boolean updateImage(@Param("userId") Integer userId, @Param("imagePath") String imagePath);

}
