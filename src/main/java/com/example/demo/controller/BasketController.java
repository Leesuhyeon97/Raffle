package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.BasketService;
import com.example.demo.vo.BasketVO;
import com.example.demo.vo.MemberVO;

@Controller
public class BasketController {
	
	static Map map=new HashMap();
	
	public BasketController() {
		map.put("1","네셔녈지오그래픽 운동화");
		map.put("2","오프화이트 스니커즈");
		map.put("3","나이키 조던 덩크 하이 시카고불스");
		map.put("4","디스커버리 스니커즈");
		map.put("5","나이키 x 사카이 와플");
		map.put("6","오징어게임 컨버스");
		map.put("7","에어 조던 1 OG Dior");
		map.put("8","아디다스 이지부스트");
		map.put("9","컨버스X플레져스 프로 레더 블랙");
		
	}
	
	@Autowired
	BasketService basketService;
	
	@PostMapping("insertBasket")
	@ResponseBody
	public String insertBasket(HttpSession session, BasketVO basketVO) {
		System.out.println(basketVO);
	
		MemberVO memberVO=(MemberVO)session.getAttribute("memberVO");
		if(memberVO==null) {
			return "로그인을 먼저 해주세요";
		}
		String id=memberVO.getId();
		basketVO.setId(id);
		
		try {
			List<BasketVO>  list=basketService.insertBasket(basketVO);
			
			JSONArray array=new JSONArray();
			for(BasketVO vo:list) {
				JSONObject jo=new JSONObject();
				jo.put("pname", map.get(vo.getSpcode()+""));
				array.add(jo);
			}
			return array.toJSONString();
		} catch (Exception e) {
			e.printStackTrace();
			return "래플 응모 실패";
		}
		
		
	
	}
	
	
	
}
