package com.etimeci.ssm.web;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.etimeci.ssm.entity.EchartMapProvance;
import com.etimeci.ssm.entity.Login;
import com.etimeci.ssm.entity.Supplier;
import com.etimeci.ssm.entity.UserMessage;
import com.etimeci.ssm.service.LoginService;
import com.etimeci.ssm.service.RegisterService;
import com.etimeci.ssm.service.SupplierService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class RegisterLoginController {
	
	@Autowired
	private RegisterService registerService;
	@Autowired
	private LoginService loginService;
	
	
	//跳到注册页面
	@RequestMapping("/goRegister")
	public String goRegister(){
		//registerService.registerInsert(userMessage);
		return "registerSystem/register";
		
	}
	//点击注册触发
/*	@RequestMapping("/register")
	@ResponseBody
	public Map<String, Integer> Register(UserMessage userMessage){
		Map<String, Integer> map=new HashMap<String, Integer>();
		System.out.println(userMessage.getUmPhone()+userMessage.getUmPassword()+userMessage.getUmName()+userMessage.getUmIdentifyNum()+userMessage.getUmEmail()+userMessage.getUmPasswordl());
		if(userMessage.getUmPhone()!=""&&userMessage.getUmPassword()!=""&&userMessage.getUmName()!=""&&userMessage.getUmIdentifyNum()!=""&&userMessage.getUmEmail()!=""&&userMessage.getUmPassword().equals(userMessage.getUmPasswordl())){
			
			List list=loginService.selectUserName(userMessage);
			if(list.isEmpty()){
				registerService.registerInsert(userMessage);
				map.put("umPhone", 1);
				return map;
				//return "redirect:/goResuccess";
			}else{
				map.put("umPhone", 2);
				//return "redirect:/goExist";
				return map;
			}
		}else{
			map.put("umPhone", 0);
			return map;
		}
		
		
	
	}*/
	
	@RequestMapping("/validRegister")
	@ResponseBody
	public Map<String, Integer> validRegister(UserMessage userMessage){
		Map<String, Integer> map=new HashMap<String, Integer>();
          if(userMessage.getUmPhone()!=""){
		List list=loginService.selectUserName(userMessage);
			if(list.isEmpty()){
				map.put("umPhone", 1);
				return map;
				//return "redirect:/goResuccess";
			}else{
				map.put("umPhone", 2);
				//return "redirect:/goExist";
				return map;
			}
		}else{
			map.put("umPhone", 0);
			return map;
		}
		
		
	
	}
	
	@RequestMapping("/register")
	
	public String  Register(UserMessage userMessage){
		
		System.out.println(userMessage.getUmPhone()+userMessage.getUmPassword()+userMessage.getUmName()+userMessage.getUmIdentifyNum()+userMessage.getUmEmail()+userMessage.getUmPasswordl());
		if(userMessage.getUmPhone()!=""&&userMessage.getUmPassword()!=""&&userMessage.getUmName()!=""&&userMessage.getUmIdentifyNum()!=""&&userMessage.getUmEmail()!=""&&userMessage.getUmPassword().equals(userMessage.getUmPasswordl())){
			
			
		registerService.registerInsert(userMessage);
		
		return "redirect:/goResuccess";
		
	}else{
		return null;
	}
	}
	
	
	
	@RequestMapping("/goExist")//用户名已存在，中间页面
	public String goExist(){
		//registerService.registerInsert(userMessage);
		return "registerSystem/exist";
		
	}
	@RequestMapping("/goResuccess")//注册成功，中间页面
	public String goResuccess(){
		//registerService.registerInsert(userMessage);
		return "registerSystem/registerSuccess";
		
	}
	
	
	//调到登陆页面
	@RequestMapping("/goLogin")
	public String goLogin(){
		//registerService.registerInsert(userMessage);
		return "registerSystem/login";
		
	}
	
	@RequestMapping("/login")//触发登录
	
	public ModelAndView login(@RequestParam(required=true,defaultValue="4") Integer pageSize,
			String suName){
		ModelAndView mv = new ModelAndView();
	   
		//List<Supplier> list = supplierService.query(suName);
		//PageInfo<Supplier> p=new PageInfo<Supplier>(list); //��ҳ��Ϣ
		//mv.addObject("supplierlist", list);
		//mv.addObject("page", p);
		mv.addObject("suName", suName);
		mv.setViewName("/sysmgr/supplier_list");
		return mv;
	}
	
	
	
	
	@RequestMapping("/goMyjsp")//测试页面
	public String goMyjsp(){
		//registerService.registerInsert(userMessage);
		return "registerSystem/MyJsp";
		
	}
	
	
	@RequestMapping(value="/helloliji")//测试ajax请求，返回json
	@ResponseBody
    public Map<String, UserMessage> hello(HttpServletResponse response) throws IOException{
		UserMessage u1=new UserMessage();
        u1.setUmPhone("123456");
        u1.setUmCity("liji");
        
        UserMessage u2=new UserMessage();
        u2.setUmPhone("654321");
        u2.setUmCity("jiki");
        Map<String,UserMessage> map=new HashMap<String, UserMessage>();
        map.put("name", u1);
        map.put("city", u2);
        ArrayList<Map<String, UserMessage>> list=new ArrayList<Map<String, UserMessage>>();
       
        list.add(map);
        return map;
    }
	
	@RequestMapping(value="/loginVali")//登录用户名验证
	@ResponseBody
    public List<UserMessage> loginVali(UserMessage userMessage) throws IOException{
		//System.out.println("---------------------------"+userMessage.getUmPhone());
		//ArrayList<Map<String, UserMessage>> list=new ArrayList<Map<String, UserMessage>>();
	     //@RequestParam(value = "umPhone", required = true, defaultValue = "10001"  
		List<UserMessage> list=loginService.selectUserName(userMessage);
        return list;
    }
	
	
	@RequestMapping(value="/loginValipass")//登录用户名验证
	@ResponseBody
    public boolean loginValipass(Login login) throws IOException{
		System.out.println("---------------3------"+login.getUmPhone()+"-----------3---------"+login.getUmPassword());
		if(login.getUmPhone().equals("18794886718")&&login.getUmPassword().equals("123")){
			return true;
		}else{
			return false;
		}
			//List<Map<String,boolen>>	
    }
	
	@RequestMapping(value="/loginValidate")//登录用户名密码验证，并登陆
	@ResponseBody
    public List<Map<String,Boolean>> loginValidate(UserMessage userMessage,HttpSession session) throws IOException{
		List<Map<String,Boolean>> list=new ArrayList<Map<String,Boolean>>();
		Map<String, Boolean> map=new HashMap<String, Boolean>();
		System.out.println(userMessage.getUmPhone()+"6666666666666666666666666666666");
		if(userMessage.getUmPhone()==""||userMessage.getUmPassword()==""||userMessage.getUmVcode()==""){
			map.put("response", false);
			list.add(map);
			System.out.println(userMessage.getUmPhone()+"999999999999999999999999999999999999999");
			return list;
			
		}else{
			List<UserMessage> list1=loginService.selectUserName(userMessage);
			String strRand = (String) session.getAttribute("rand");
			String s=userMessage.getUmVcode();
			System.out.println("----------------------------------------"+list1+"-----------------");
			//Login login=new Login();
			System.out.println("------------------------------------------"+userMessage.getUmVcode()+"-----------------");
			if(list1.isEmpty()){
				map.put("umPhone", false);
				map.put("umPassword", false);
				map.put("vcode", false);
				list.add(map);
				return list;
			}else{
				
				if(list1.get(0).getUmPassword().equals(userMessage.getUmPassword())){
					
					if(s.toLowerCase().equals(strRand.toLowerCase())){
						map.put("umPhone", true);
						map.put("umPassword", true);
						map.put("vcode", true);
						list.add(map);
						return list;
					}else{
						map.put("umPhone", true);
						map.put("umPassword", true);
						map.put("vcode", false);
						list.add(map);
						return list;
					}
				}else{
					map.put("umPhone", true);
					map.put("umPassword", false);
					map.put("vcode", false);
					list.add(map);
					return list;
				}
			}
		}
			
			
    }
	
	//中国地图
    @RequestMapping("/goEchartsMap")
    @ResponseBody
    public List<List<EchartMapProvance>> goEchartsMap() {
        System.out.println("中国地图");
        Map<String,Object> map1=new HashedMap();
        List<List<EchartMapProvance>> listt=new ArrayList<List<EchartMapProvance>>();


        List<EchartMapProvance> a=registerService.selectMapA();
        List<EchartMapProvance> b=registerService.selectMapB();
        listt.add(a);
        listt.add(b);


        return listt;
    }
  //修改datatables表
    @RequestMapping("/goUpdateTable")
    @ResponseBody
    public Boolean goUpdateTable(@RequestBody UserMessage userMessage) {
        System.out.println("进入更新kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        System.out.println(userMessage.toString());
        //Boolean result=true;

        Boolean result = registerService.updateDataTables(userMessage);
        System.out.println("ssssssssssseeeeeeeeeefffssssp"+result);

        return result;
    }
	
	
  //删除datatables表
    @RequestMapping("/goDeleteTable")
    @ResponseBody
    public int goDeleteTable(Integer u_id) {
        System.out.println("进入删除");
        System.out.println("u_id"+u_id);
        int result = registerService.deleteDataTables(u_id,"ss");
        System.out.println("result"+result);
        return result;
    }
	

}
