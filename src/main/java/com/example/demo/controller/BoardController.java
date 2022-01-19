package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.BoardService;
import com.example.demo.vo.BoardVO;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@RequestMapping("boardList")
	public ModelAndView boardList() {
		List<BoardVO>list=boardService.boardList();
		System.out.println("boardList: " + list.size());
		ModelAndView mav=new ModelAndView("boardList");
		mav.addObject("boardList", list);
		return mav;
	}
	
	@RequestMapping("boardWriteForm")
	public String boardWriteForm() {
		return "boardWriteForm";
	}
}