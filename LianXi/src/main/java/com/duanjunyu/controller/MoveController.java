package com.duanjunyu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.duanjunyu.entity.Move;
import com.duanjunyu.entity.Type;
import com.duanjunyu.service.MoveService;

@Controller
public class MoveController {
	@Resource
	private MoveService ms;

	@RequestMapping("list.do")
	public String list(ModelMap map){
		List<Move> list=ms.list();
		map.put("list", list);
		return "list";
	}
	
	@RequestMapping("findtype.do")
	@ResponseBody
	public List<Type> findtype(){
		System.out.println("11");
		List<Type> li=ms.findtype();
		
		return li;
	}
}
