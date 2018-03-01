package com.etimeci.ssm.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etimeci.ssm.entity.PageMess;
import com.etimeci.ssm.entity.UserMessage;
import com.etimeci.ssm.service.RegisterService;



/*本周学习计划如下:
一、知识点
1.学习jquery dataTables
2.学习Echart 折线图、柱图、堆叠图
二、目标
1、会使用jquery dataTables 呈现表格分页数据
2、会使用echart 呈现折线图、柱图和堆叠图*/
@Controller
public class DataTableController {
	@Autowired
	private RegisterService registerService;
	
	
	@RequestMapping("/goTestDatatable")
	public String goTestDatatable(){
		//registerService.registerInsert(userMessage);
		return "testDatatables/datatable";
    }
	
	
	@RequestMapping("/goTestDatatable2")
	public String goTestDatatable2(){
		//registerService.registerInsert(userMessage);
		return "testDatatables/datatable1";
    }
	
	
	@RequestMapping("/requestAjax")//datatable表数据获取
	@ResponseBody
	public List<Map<String, Object>> requestAjax(PageMess pageMess){
		System.out.println(pageMess.getLimit()+"-----"+pageMess.getStart()+"-------"+pageMess.getPage());
		List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
		Map<String, Object> map=new HashMap<String, Object>();
		Map<String, Object> map1=new HashMap<String, Object>();
		Map<String, Object> map2=new HashMap<String, Object>();
		Map<String, Object> map3=new HashMap<String, Object>();
		Map<String, Object> map4=new HashMap<String, Object>();
		UserMessage userMessage=new UserMessage();
		userMessage.setUmId(10);
		List<Map<String, Object>> list2=registerService.selectUserAll(pageMess);
		System.out.println(list2.toString()+"jjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		System.out.println(list2.get(0));
	    map1.put("Id", "1");
		map1.put("Name", "name1");
		map1.put("Sex", "女");
		list.add(map1);
		
		map2.put("Id", "2");
		map2.put("Name", "name2");
		map2.put("Sex", "男");
		list.add(map2);
		
		map3.put("Id", "3");
		map3.put("Name", "nama3");
		map3.put("Sex", "女");
		list.add(map3);
		
		map4.put("Id", "4");
		map4.put("Name", "nama4");
		map4.put("Sex", "男");
		
		list.add(map4);
		
		
		int j=0;
		for(int i=0;i<20;i++){
			map.put("Id", String.valueOf(j));
			map.put("Name", "name"+String.valueOf(j));
			map.put("Sex", "女");
			j++;
		//	list.add(map);
			
		}
		
		
		 List<String[]> lst = new ArrayList<String[]>();  
	        for (int i = 0; i < 20; i++) {  
	            String[] d = { "co1_data" + i, "col2_data" + i };  
	            lst.add(d);  
	        }  
	        
	        
	        
		//list.get(15).put("Id", "200");
		System.out.println(list.toString());
		System.out.println(lst.toString()+"00000000000000000000");
		return list2;
}
	
	
	//-------------------Echarts-------------------------------
	
	@RequestMapping("/goEcharts1")
	public String goEcharts1(){
		//registerService.registerInsert(userMessage);
		return "echarts/echarts";
    }
	
	
}