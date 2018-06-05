package com.etimeci.ssm.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.etimeci.ssm.entity.Answer;
import com.etimeci.ssm.entity.Exam;
import com.etimeci.ssm.entity.Question;
import com.etimeci.ssm.entity.TestScore;
import com.etimeci.ssm.entity.UserMessage;
import com.etimeci.ssm.service.SolutionService;
import com.etimeci.ssm.util.DataToXml;
import com.etimeci.ssm.util.RedisCacheManager;

@Controller
public class SolutionController {

    @Autowired
    private SolutionService solutionService;
    @Autowired
    private RedisCacheManager redisCacheManager;

    //进入创建问题页面
    @RequestMapping("/goCreateQuestionnaire")
    public ModelAndView goCreateQuestionnaire(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userMessage", session.getAttribute("user"));
        mv.setViewName("/solution/createQuestionnaire");
        return mv;
    }

    //进入创建问卷信息页面
    @RequestMapping("/goCreateExam")
    public ModelAndView goCreateExam(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userMessage", session.getAttribute("user"));
        mv.setViewName("/solution/createExam");
        return mv;
    }

    //创建问卷，提交问卷信息（title，时间等）
    @RequestMapping("/createExamMessage")
    @ResponseBody
    public Map<String, String> createExamMessage(
        HttpSession session,
        Exam exam
        ) {
        Map<String, String> map = new HashMap<String, String>();
        UserMessage userMessage = (UserMessage)session.getAttribute("user");
        exam.setFounderId(userMessage.getUmId());
        if (solutionService.insertExamMessage(exam)) {
            map.put("status", "1");
        } else {
            map.put("status", "0");
        }

        return map;
    }

    //进入自己创建的问卷list页面
    @RequestMapping("/goExamList")
    public ModelAndView goExamList(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userMessage", session.getAttribute("user"));
        mv.setViewName("/solution/examList");
        return mv;
    }

    //获取用户创建的问卷信息，以list显示出来（弹性盒子）
    @RequestMapping("/getExamList")
    @ResponseBody
    public List<UserMessage> getExamList(HttpSession session) {
        UserMessage userMessage = (UserMessage) session.getAttribute("user");
        int umId = userMessage.getUmId();
        List<UserMessage> data = solutionService.selectExamList(umId);
        return data;
    }

    //用户创建问卷，提交问卷信息
    @RequestMapping("/addQuestionList")
    @ResponseBody
    public Map<String, String> addQuestionList(@RequestBody List<Question> questionList) {
        for (int i = 0; i < questionList.size(); i++) {
            DataToXml xml = new DataToXml();
            List<Map<String, String>> list = questionList.get(i).getOption();
            String optionString = xml.insertXmlContent(list, "option", "D:\\xml\\students.xml");
            questionList.get(i).setOptionString(optionString);
        }
        Map<String, String> map = new HashMap<String, String>();
        if (solutionService.insertQuestionList(questionList)) {
            map.put("status", "1");
        } else {
            map.put("status", "0");
        }

        return map;
    }

    //进入答题页面，使用者用链接url进入
    @RequestMapping("/goAnswerQuestion")
    public ModelAndView goAnswerQuestion(HttpServletRequest request, @RequestParam(value="examId",required=true) int examId) {

        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
          ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
          ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
          ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
          ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
          ip = request.getRemoteAddr();
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("examId", examId);
        mv.setViewName("/solution/answerQuestion");
        redisCacheManager.set(ip, examId);
        return mv;
    }

    //答题页面异步加载问题的信息，获取问题的题目选项信息
    @RequestMapping("/getQuestionList")
    @ResponseBody
    public List<Question> getQuestionList(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
          ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
          ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
          ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
          ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
          ip = request.getRemoteAddr();
        }

        Object id = redisCacheManager.get(ip);
        Integer examId = (Integer) id;
        List<Question> list = new ArrayList<Question>();
        list = solutionService.selectQuestionList(examId, 0, 4);
        return list;
    }

    //进入显示链接页面
    @RequestMapping("/goShowLink")
    public ModelAndView goShowLink(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userMessage", session.getAttribute("user"));
        mv.setViewName("/solution/linkPage");
        return mv;
    }

    //删除某一个问卷
    @RequestMapping("/deleteExam")
    @ResponseBody
    public Map<String, String> deleteExam(@RequestParam(value="examId",required=true) String examId) {
        Map<String, String> map = new HashMap<String, String>();
        if (solutionService.updteExamById(examId)) {
            map.put("status", "1");
        } else {
            map.put("status", "0");
        }

        return map;
    }

    //查看是否创建问卷，创建则进入链接页面，没有创建则进入创建页面
    @RequestMapping("/getQuestion")
    @ResponseBody
    public Map<String, String> getQuestion(@RequestParam(value="examId",required=true) String examId) {
        Map<String, String> map = new HashMap<String, String>();
        Integer id = Integer.parseInt(examId);
        if (solutionService.selectQuestionList(id, 1, 2).size() > 0) {
            map.put("status", "1");
        } else {
            map.put("status", "0");
        }

        return map;
    }

    //用户查看创建的问卷（预览）
    @RequestMapping("/goUserSeeQuestionList")
    public ModelAndView goUserSeeQuestionList() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/solution/userSeeQuestionList");
        return mv;
    }

    //问卷答案
    @RequestMapping("/submitAnswerss")
    @ResponseBody
    public Map<String, String> submitAnswerss(@RequestBody List<Answer> answerList, HttpSession session) {
        int testId = (int)redisCacheManager.get("testId") + 1;
        int usefulId = 0;
        int examId = Integer.parseInt(answerList.get(0).getExamId());
        for (int i = 0; i < 1000; i++) {
            if (solutionService.selectTestId(testId).size() > 0) {
                testId++;
            } else {
                usefulId = testId;
                redisCacheManager.set("testId", usefulId);
                break;
            }
        }

        Map<String, String> map = new HashMap<String, String>();

        List<Question> list = solutionService.selectQuestionList(Integer.parseInt(answerList.get(0).getExamId()), 0, 4);
        int sumScore = 0;
        for(int i = 0; i < answerList.size(); i++) {
            answerList.get(i).setTestId(usefulId);
            if (answerList.get(i).getType().equals("radio")) {
                int value = Integer.parseInt(answerList.get(i).getValue());
                int getScore = Integer.parseInt(list.get(i).getOption().get(value - 1).get("score"));
                sumScore = sumScore + getScore;
            } else if (answerList.get(i).getType().equals("checkbox")) {
                String[] arr = answerList.get(i).getValue().split("\\|");
                int value[] = new int[arr.length];
                int ckeckboxScore = 0;
                for ( int j = 0; j < arr.length; j++) {
                    value[j] = Integer.parseInt(arr[j]);
                    int getScore = Integer.parseInt(list.get(i).getOption().get(value[j] - 1).get("score"));
                    if (getScore == 0) {
                        ckeckboxScore = 0;
                        break;
                    }
                    ckeckboxScore = ckeckboxScore + getScore;
                }
                sumScore = sumScore + ckeckboxScore;

            } else if (answerList.get(i).getType().equals("textarea")) {
            }
        }
        TestScore testScore = new TestScore();
        testScore.setTestId(usefulId);
        testScore.setExamId(examId);
        testScore.setTestScore((float)sumScore);
        if (session.getAttribute("userId") != null) {
            testScore.setUserId((int)session.getAttribute("userId"));
        }

        if (solutionService.insertTestMessage(testScore) && solutionService.insertAnswerMessage(answerList)) {
            map.put("status", "1");
        } else {
            map.put("status", "0");
        }

        return map;
    }

    //提交问题成功页面
    @RequestMapping("/goSumitSuccess")
    public ModelAndView goSumitSuccess() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/solution/submitSuccess");
        return mv;
    }

    //得到问题选项的数量
    @RequestMapping("/getOptionNum")
    @ResponseBody
    public Map<String, String> getOptionNum(
            @RequestParam(value="type",required=true) String type,
            @RequestParam(value="questionNum",required=true) Integer questionNum,
            @RequestParam(value="examId",required=true) Integer examId,
            @RequestParam(value="optionNum",required=true) Integer optionNum
        ) {
        Map<String, String> map = new HashMap<String, String>();
        String numberString = "";
        if (type.equals("radio")) {
            for (int i = 0; i < optionNum; i++) {
                int number = solutionService.selectEveryOptionNum(type, questionNum, examId, i+1);
                numberString = numberString + String.valueOf(number) + ",";
            }
            map.put("value", numberString);
        } else if (type.equals("checkbox")) {
            for (int i = 0; i < optionNum; i++) {
                String optionNumString = "";
                optionNumString = String.valueOf(i + 1) + "|";
                int number = solutionService.selectEveryCheckboxOptionNum(type, questionNum, examId, optionNumString);
                numberString = numberString + String.valueOf(number) + ",";
            }
            map.put("value", numberString);
        }
        return map;
    }

    //获取填写问卷的数量和时间的数据
    @RequestMapping("/getTestScoreTotal")
    @ResponseBody
    public List<TestScore> getTestScoreTotal(@RequestParam(value="examId",required=true) Integer examId) {
        List<TestScore> data = solutionService.selectTestScoreTotal(examId);
        return data;
    }

    //用户看到的页面异步加载问题的信息，获取问题的题目选项信息
    @RequestMapping("/getUserSeeQuestionList")
    @ResponseBody
    public List<Question> getUserSeeQuestionList(@RequestParam(value="examId",required=true) Integer examId) {
        List<Question> list = new ArrayList<Question>();
        list = solutionService.selectQuestionList(examId, 0, 4);
        return list;
    }

    @RequestMapping("/getLineChartMessage")
    @ResponseBody
    public List<Map<String, String>> getLineChartMessage(@RequestParam( value = "examId", required = false) Integer examId) {
        float maxScore = solutionService.selectMaxScore(examId);
        float score = maxScore/(float)5.0;
        String everScoreString = String.format("%.1f", score);
        float everScore = Float.parseFloat(everScoreString);
        String[] stringScore = new String[7];
        List<Map<String, String>> list = new ArrayList<Map<String,String>>();

        for(int i = 0; i < 5; i++) {
            Map<String, String> map = new HashMap<String, String>();
            if (i == 4) {
                String towScoreString = String.format("%.1f", everScore*i);
                stringScore[4] = towScoreString + "-" + String.valueOf(maxScore);
                map.put("scoreArea", stringScore[4]);
                map.put("counts", String.valueOf(solutionService.selectScoreCount(examId, everScore*4, maxScore)));
            } else if (i == 0) {
                stringScore[i] = String.valueOf(everScore*i) + "-" + String.valueOf(everScore*(i+1));
                map.put("scoreArea", stringScore[i]);
                map.put("counts", String.valueOf(solutionService.selectScoreCount(examId, everScore*i, everScore*(i+1))));
            } else {
                String oneScoreString = String.format("%.1f", everScore*(i+1));
                String towScoreString = String.format("%.1f", everScore*i);
                stringScore[i] = towScoreString + "-" + oneScoreString;
                map.put("scoreArea", stringScore[i]);
                map.put("counts", String.valueOf(solutionService.selectScoreCount(examId, everScore*i + 0.1f, everScore*(i+1))));
            }

            list.add(map);
        }

        return list;
    }
}
