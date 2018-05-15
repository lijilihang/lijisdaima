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
    public ModelAndView goUserSeeQuestionList(HttpServletRequest request, @RequestParam(value="examId",required=true) int examId) {

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
        mv.setViewName("/solution/userSeeQuestionList");
        redisCacheManager.set(ip, examId);
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
            //int questionNum = 0;
            if (answerList.get(i).getType().equals("radio")) {
                int value = Integer.parseInt(answerList.get(i).getValue());
                //questionNum = Integer.parseInt(answerList.get(i).getQuestionNum());
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
        System.out.println(sumScore);
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
}
