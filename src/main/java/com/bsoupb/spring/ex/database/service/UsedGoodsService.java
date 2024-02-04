package com.bsoupb.spring.ex.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsoupb.spring.ex.database.domain.UsedGoods;
import com.bsoupb.spring.ex.database.repository.UsedGoodsRepository;

// 로직(business) 담당
@Service
public class UsedGoodsService {
	
	// 객체 생성
	@Autowired // 객체를 사용할 때 변수에 주입 (객체 생성하지 않아도 됨)
	private UsedGoodsRepository usedGoodsRepository;
	
	// 중고물품 게시글 리스트
	public List<UsedGoods> getUsedGoodsList(){
		
		List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
		
		return usedGoodsList;
		
	}

}
