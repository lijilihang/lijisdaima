package com.etimeci.ssm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
	@RequestMapping("/goIndexRegister1")
	public String goIndexRegister1(){
		//registerService.registerInsert(userMessage);
		return "diaochawenjuan/index";
		
	}
	
	@RequestMapping("/goAboutRegister")
	public String goAboutRegister(){
		//registerService.registerInsert(userMessage);
		return "diaochawenjuan/about";
		
	}
	
	@RequestMapping("/goContactRegister")
	public String goContactRegister(){
		//registerService.registerInsert(userMessage);
		return "diaochawenjuan/contact";
		
	}
	
	@RequestMapping("/goPro_dRegister")
	public String goPro_dRegister(){
		//registerService.registerInsert(userMessage);
		return "diaochawenjuan/pro_d";
		
	}
	
	@RequestMapping("/goProductRegister")
	public String goProductRegister(){
		//registerService.registerInsert(userMessage);
		return "diaochawenjuan/product";
		
	}
	
	@RequestMapping("/goServiceRegister")
	public String goServiceRegister(){
		//registerService.registerInsert(userMessage);
		return "diaochawenjuan/service";
		
	}
	
	
	@RequestMapping("/goSolutionRegister")
	public String goSolutionRegister(){
		//registerService.registerInsert(userMessage);
		return "diaochawenjuan/solution";
		
	}

}
