package com.bsoupb.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Request 역할
public class Ex01Controller {
	
	@RequestMapping("/lifecycle/ex01/1") // WebServlet 역할
	@ResponseBody // Response 역할
	public String stringResponse() {
		return "<h1>예제 1번 문자열 담기</h1>";
	}
	
	@RequestMapping("/lifecycle/ex01/2")
	@ResponseBody
	// map은 javascript의 딕셔너리랑 유사
	// json : javascript 자료형을 문자형으로 구성
	// map을 딕셔너리 형태의 key, value 형태의 json 문자열
	public Map<String, Integer> mapResponse(){
		
		// 과일이름 : 가격
		Map<String, Integer> fruitMap = new HashMap<>();
		
		fruitMap.put("apple", 1200);
		fruitMap.put("banana", 3000);
		fruitMap.put("orange", 1000);
		
		return fruitMap;
	}
	
}
