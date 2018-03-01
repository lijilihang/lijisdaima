package com.etimeci.ssm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.etimeci.ssm.entity.Supplier;
import com.etimeci.ssm.service.SupplierService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Controller
public class SupplierController {
	
	
	//供应商查询----------------------------------------------------------------头
	@Autowired
	private SupplierService supplierService;
	
	
	
	
	@RequestMapping("/goAddSupplier")
	public String goAddSupplier(){
		return "sysmgr/supplier_add";
	}
	
	
	@RequestMapping("/addSupplier")
	public String addUser(Supplier supplier){
		//1.���ܲ���
		//System.out.println(user);
		//2.����ҵ���߼�
		supplierService.insertSupplier(supplier);
		System.out.println(supplier);
		return "redirect:/listSupplier";
	}
	
	
	
	
	
	@RequestMapping("/listSupplier")
	public ModelAndView listSupplier(@RequestParam(required=true,defaultValue="1") Integer page,
			@RequestParam(required=true,defaultValue="4") Integer pageSize,
			String suName){
		ModelAndView mv = new ModelAndView();
		
		//System.out.println(userName + "====" + trueName);
		
		PageHelper.startPage(page, pageSize);
		List<Supplier> list = supplierService.query(suName);
		System.out.println("----------------------------"+list+"--------------------------------------------------------------------");
		PageInfo<Supplier> p=new PageInfo<Supplier>(list); //��ҳ��Ϣ
		mv.addObject("supplierlist", list);
		mv.addObject("page", p);
		System.out.println("sssssssssssssssssssssssssssss"+p);
		mv.addObject("suName", suName);
		
		mv.setViewName("/sysmgr/supplier_list");
		return mv;
	}
	
	
	//供应商查询----------------------------------------------------------------尾
	
	
	
	//供应商更新--------------------------------------头
	
	@RequestMapping("/listAddSupplier")
	public ModelAndView listAddSupplier(Integer suId){
		ModelAndView mv = new ModelAndView();
		
		//System.out.println(userName + "====" + trueName);
		
		//PageHelper.startPage(page, pageSize);
		List<Supplier> listt =  supplierService.findSupplierById(suId);
		System.out.println("ooooooooooooooooooooooooooooooooooooo"+listt);
		System.out.println("pppppppppppppppppppppppppppppppppppppp"+listt+"--------------------------------------------------------------------");
		PageInfo<Supplier> p=new PageInfo<Supplier>(listt); //��ҳ��Ϣ
		mv.addObject("supplierlist", listt);
		mv.addObject("page", p);
		mv.addObject("suId", suId);
		
		mv.setViewName("/suUpdateAction/supplier_update");
		return mv;
	}
	
	
	
	
	
	
	@RequestMapping("/updateSupplier")
	public ModelAndView updateSupplier(Supplier supplier){
		ModelAndView mv = new ModelAndView();
		//1.���ܲ���
		//System.out.println(user);
		//2.����ҵ���߼�
		System.out.println("--------------------："+supplier);
		supplierService.updateSupplier(supplier);
		
//		System.out.println(list2);
		mv.setViewName("redirect:/listSupplier");
		return mv;
		//return "suUpdateAction/supplier_update";
	}
	
	
	//供应商更新--------------------------------------尾
	
	
	
	//供应商删除-----------------------------------------------头
	
	@RequestMapping("/deleteSupplier")
	public ModelAndView deleteSupplier(Integer suId){
		ModelAndView mv = new ModelAndView();
		//1.���ܲ���
		//System.out.println(user);
		//2.����ҵ���߼�
		System.out.println("--------------------："+suId);
		supplierService.deleteSupplier(suId);
		
//		System.out.println(list2);
		mv.setViewName("redirect:/listSupplier");
		return mv;
		//return "suUpdateAction/supplier_update";
	}
	
	//供应商删除-----------------------------------------------------尾
	
	
	//商品查询---------------------------------------------------------头
	@RequestMapping("/listPro")
	public String listShangpin(){
		return "productAction/pro_list";
	}
	//商品查询---------------------------------------------------------尾
	
	
	
	//食堂信息查询--------------------------------------------头
	@RequestMapping("/listShitang")
	public String listShitang(){
		return "shitangAction/shitang_list";
	}
	
	//食堂信息查询--------------------------------------------尾
	
	
	//出库查询-------------------------------------------头
	
	@RequestMapping("/listOut")
	public String listOut(){
		return "outAction/out_list";
	
	}
	//出库查询-------------------------------------------尾
	
	
	//食堂信息管理---------------------------------------------头
	
	@RequestMapping("/listStxx")
	public String listStxx(){
		return "shitangxxAction/stxx_list";
	
	
}
	//食堂信息管理---------------------------------------------头
	
	
	//商品信息管理---------------------------------------头
	@RequestMapping("/listSpxx")
	public String listSpxx(){
		return "shangpinxxAction/spxx_list";
	
	
}
	//商品信息管理---------------------------------------尾
	
	
	
	
	
	//供应信息管理---------------------------------------头
	@RequestMapping("/listGyxx")
	public String listGyxx(){
		return "gongyingxxAction/gyxx_list";
     }
	//供应信息管理---------------------------------------尾
	
	
	
	
	//进货单-----------------------------------------头 
	
	@RequestMapping("/listJhd")
	public String listJhd(){
		return "jinhuodanAction/jhd_list";
     }
	
	//进货单-----------------------------------------尾
	
	
	//出货单--------------------------------------头
	@RequestMapping("/listThd")
	public String listThd(){
		return "tuihuodanAction/thd_list";
     }
	//出货单--------------------------------------尾

	//出库单-----------------------------------------头

	@RequestMapping("/listCkd")
	public String listCkd(){
		return "chukudanAction/ckd_list";
     }

    //出库单-----------------------------------------尾
	
	
	//库存盘点-----------------------------------------头
	
	@RequestMapping("/listKcpd")
	public String listKcpd(){
		return "kucunpandian/kcpd_list";
     }
	
	
	//库存盘点-----------------------------------------尾
}	
	
	
	
	
	
	
	
	
	
	
	

