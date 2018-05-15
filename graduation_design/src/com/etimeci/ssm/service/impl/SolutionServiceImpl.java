package com.etimeci.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etimeci.ssm.dao.SolutionDao;
import com.etimeci.ssm.entity.Answer;
import com.etimeci.ssm.entity.Exam;
import com.etimeci.ssm.entity.Question;
import com.etimeci.ssm.entity.TestScore;
import com.etimeci.ssm.entity.UserMessage;
import com.etimeci.ssm.service.SolutionService;
import com.etimeci.ssm.util.DataToXml;

@Service
public class SolutionServiceImpl implements SolutionService {
    @Autowired
    private SolutionDao solutionDao;

    @Override
    public Boolean insertExamMessage(Exam exam) {
        return solutionDao.insertExamMessage(exam);
    }

    @Override
    public List<UserMessage> selectExamList(Integer founderId) {
        return solutionDao.selectExamList(founderId);
    }

    @Override
    public Boolean insertQuestionList(List<Question> list) {
        return solutionDao.insertQuestionList(list);
    }

    @Override
    public List<Question> selectQuestionList(Integer examId, Integer offset, Integer pageSize) {
        List<Question> list = solutionDao.selectQuestionList(examId, offset, pageSize);
        DataToXml xml = new DataToXml();
        for(int i = 0; i<list.size(); i++) {
            String s = list.get(i).getOptionString();
            String t = list.get(i).getType();
            if (t.equals("textArea")) {
                continue;
            } else {
                list.get(i).setOption(xml.selsctXmlContent(s));
                list.get(i).setOptionString("");
            }
        }
        return list;
    }

    @Override
    public Boolean updteExamById(String examId) {
        return solutionDao.updteExamById(examId);
    }

    @Override
    public List<TestScore> selectTestId(Integer testId) {
        return solutionDao.selectTestId(testId);
    }

    @Override
    public Boolean insertAnswerMessage(List<Answer> list) {
        return solutionDao.insertAnswerMessage(list);
    }

    @Override
    public Boolean insertTestMessage(TestScore testScore) {
        return solutionDao.insertTestMessage(testScore);
    }
}
