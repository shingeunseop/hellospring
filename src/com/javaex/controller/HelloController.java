package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.vo.BoardVo;

@Controller//컨트롤러로 인식하는 필수
@RequestMapping(value="/guestb")
public class HelloController {
	
	//3.controller
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	// 이 값이 받는 주소 /spring,Request 생략시 get으로 됨
	//주소쓸때 /h/gb/insert
	public String spring(BoardVo vo) {
		
		System.out.println(vo.toString());
		
		
		return "/WEB-INF/views/form.jsp";
		
		
	}
	
	@RequestMapping(value="/{no}/delete",method=RequestMethod.GET)// 이 값이 받는 주소 /spring,Request 생략시 get으로 됨
	public String hello(@PathVariable("no") int no) {
		
		System.out.println(no+"번 지웠다.");
		
		return "/WEB-INF/views/index02.jsp";
		
		
	}

}
