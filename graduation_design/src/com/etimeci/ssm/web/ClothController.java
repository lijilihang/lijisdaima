package com.etimeci.ssm.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etimeci.ssm.entity.Cloth;
import com.etimeci.ssm.entity.EchartData;
import com.etimeci.ssm.entity.Middle;
import com.etimeci.ssm.entity.Old;
import com.etimeci.ssm.entity.Series;
import com.etimeci.ssm.entity.Young;
//import com.etimeci.ssm.entity.TotalNum;
import com.etimeci.ssm.service.ClothService;
import com.etimeci.ssm.service.PeopleService;

@Controller
public class ClothController {
	@Autowired
	private ClothService clothService;
	@Autowired
	private PeopleService peopleService;
	
	@RequestMapping("/goEcharts3")
	public String goEcharts3(){
		//registerService.registerInsert(userMessage);
		return "echarts/echarts1";
    }
	
	@RequestMapping("/goEcharts4")
	public String goEcharts4(){
		//registerService.registerInsert(userMessage);
		return "echarts/echarts2";
    }
	@RequestMapping("/goEcharts5")
	public String goEcharts5(){
		//registerService.registerInsert(userMessage);
		return "echarts/echarts3";
    }
	
	@RequestMapping("/goEcharts6")
	public String goEcharts6(){
		//registerService.registerInsert(userMessage);
		return "echarts/echarts4";
    }
	
	
	//地图实例1百度    会使用echart 饼图、地图呈现出来，并调整图表颜色及样式
	@RequestMapping("/goEcharts7")
	public String goEcharts7(){
		//registerService.registerInsert(userMessage);
		return "echarts/echarts5";
    }
	
	@RequestMapping("/goEcharts8")
	public String goEcharts8(){
		//registerService.registerInsert(userMessage);
		return "echarts/echarts6";
    }
	@RequestMapping("/goEcharts9")
	public String goEcharts9(){
		//registerService.registerInsert(userMessage);
		return "echarts/echarts7";
    }
	
	@RequestMapping("/goCloth1")
	@ResponseBody
	public List<Map<String, Object>> goCloth1(){
		List<Map<String, Object>> a=clothService.selectClothNum();
//		System.out.println(a.get(0));
	
		 Object xx = a.get(0);
		
		 Cloth c = (Cloth)xx;
		 System.out.println(c.getcId());
		 
		//int ttt = 0;
		
	//System.out.println(String.valueOf(a.get(0).get("cId")));
		/*String[] s=new String[a.get(0).size()];
		Object[] o=new Object[a.get(0).size()];
		int t=0;
		for(Entry<String, Object> entry:a.get(0).entrySet()){
			String key=entry.getKey();
			s[t]=key;
			Object value=entry.getValue();
			o[t]=value;
			t++;
		}
		System.out.println(o[1].toString());*/
		//.get("cNum")
		//registerService.registerInsert(userMessage);
		return a;
    }
	
	
	
	//柱状图
	@RequestMapping("/showEchartBar")
    @ResponseBody
    public EchartData<Integer> BarData() {
        System.out.println("柱状图");
        List<String> category = new ArrayList<String>();
        List<Integer> serisData=new ArrayList<Integer>();
       /* List<TotalNum> list = toatlNumBiz.findAll();
        for (TotalNum totalNum : list) {
            category.add(totalNum.getWeek());
            serisData.add(totalNum.getCount());
        }*/
        List<Map<String, Object>> a=clothService.selectClothNum();
        for(int i=0;i<a.size();i++){
        	Object xx = a.get(i);
    	    Cloth c = (Cloth)xx;
    	    category.add(c.getcName());
    	    serisData.add(c.getcNum());
        }
        
        List<String> legend = new ArrayList<String>(Arrays.asList(new String[] { "总数比较" }));// 数据分组
        List<Series<Integer>> series = new ArrayList<Series<Integer>>();// 纵坐标
        series.add(new Series<Integer>("总数比较","bar", 40,"2", serisData));
        EchartData<Integer> data = new EchartData<Integer>(legend, category, series);
        return data;
    }
	
	
	//折线图
	@RequestMapping("/showEchartLine")
    @ResponseBody
    public EchartData<Integer> lineData() {
        System.out.println("折线图");
        List<String> category = new ArrayList<String>();
        List<Integer> serisData=new ArrayList<Integer>();
       /* List<TotalNum> list = toatlNumBiz.findAll();
        for (TotalNum totalNum : list) {
            category.add(totalNum.getWeek());
            serisData.add(totalNum.getCount());
        }*/
        
        List<Map<String, Object>> a=clothService.selectClothNum();
        for(int i=0;i<a.size();i++){
        	Object xx = a.get(i);
    	    Cloth c = (Cloth)xx;
    	    category.add(c.getcName());
    	    serisData.add(c.getcNum());
        }
        List<String> legend = new ArrayList<String>(Arrays.asList(new String[] { "总数比较" }));// 数据分组
        List<Series<Integer>> series = new ArrayList<Series<Integer>>();// 纵坐标
        series.add(new Series<Integer>("总数比较","line", 40,"1", serisData));
        EchartData<Integer> data = new EchartData<Integer>(legend, category, series);
        return data;
    }
	
	
	
	//  饼状图 
    @RequestMapping("/showEchartPie")
    @ResponseBody
    public EchartData<Map<String,Object>> PieData() {
        List<String> legend = new ArrayList<String>();
        List<Map<String, Object>> serisData=new ArrayList<Map<String, Object>>();
        
      
        
        List<Map<String, Object>> a=clothService.selectClothNum();
        for(int i=0;i<a.size();i++){
        	Map<String,Object> map =new HashMap<String,Object>();
        	Object xx = a.get(i);
    	    Cloth c = (Cloth)xx;
    	    legend.add(c.getcName());
    	    map.put("value", c.getcNum());
            map.put("name",c.getcName());
            serisData.add(map);
    	   /* 
    	    category.add(c.getcName());
    	    serisData.add(c.getcNum());*/
        }
        
        
        
        
    /*     
        List<Visit> list = visitBiz.findAll();
        for (Visit visit : list) {
            Map map =new HashMap();
            legend.add(visit.getName());
            map.put("value", visit.getValue());
            map.put("name",visit.getName());
            serisData.add(map);
        }
        */
        
        
        List<Series<Map<String,Object>>> series = new ArrayList<Series<Map<String,Object>>>();// 纵坐标
        series.add(new Series<Map<String,Object>>("总数比较","pie", 40,null, serisData));
        //series.add(new Series("总数比较","pie",40,null,serisData));
        EchartData<Map<String,Object>> data = new EchartData<Map<String,Object>>(legend,null, series);
        return data;
    }
    
    
    
    
    
    
    
	
	@RequestMapping("/showEchartBarplus")
    @ResponseBody
    public EchartData<Integer> showEchartBarplus() {
        System.out.println("柱状图");
        List<String> category = new ArrayList<String>();
        List<Integer> serisData1=new ArrayList<Integer>();
        List<Integer> serisData2=new ArrayList<Integer>();
        List<Integer> serisData3=new ArrayList<Integer>();
       
        List<Young> a=peopleService.selectMessageYoung();
        List<Middle> b=peopleService.selectMessageMiddle();
        List<Old> c=peopleService.selectMessageOld();
        System.out.println(a.toString()+"sssssssssssssss");
        
        serisData1.add(a.get(0).getyNum());
        serisData1.add(b.get(0).getmNum());
        serisData1.add(c.get(0).getoNum());
        
        serisData2.add(a.get(1).getyNum());
        serisData2.add(b.get(1).getmNum());
        serisData2.add(c.get(1).getoNum());
        
        serisData3.add(a.get(2).getyNum());
        serisData3.add(b.get(2).getmNum());
        serisData3.add(c.get(2).getoNum());
        category.add("0-5000步");
        category.add("5000-10000步");
        category.add("10000步以上");
        List<String> legend = new ArrayList<String>(Arrays.asList(new String[] { "青年人","中年人","老年人" }));// 数据分组
        List<Series<Integer>> series = new ArrayList<Series<Integer>>();// 纵坐标
        series.add(new Series<Integer>("青年人","bar",40, "aa", serisData1));
        series.add(new Series<Integer>("中年人","bar" ,40,"aa", serisData2));
        series.add(new Series<Integer>("老年人","bar" ,40,"aa", serisData3));
        EchartData<Integer> data = new EchartData<Integer>(legend, category, series);
        System.out.println(data.toString()+"00000000000000000000000");
        return data;
      
    }

}
