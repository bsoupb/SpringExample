package com.bsoupb.spring.ex.database.repository;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bsoupb.spring.ex.database.domain.UsedGoods;

// Mybatis framework
// 데이터베이스 관련 기능 담당
@Mapper
public interface UsedGoodsRepository {
	
	public List<UsedGoods> selectUsedGoodsList(); // 수행시킬 쿼리를 호출할 메소드를 정의한 다음에 이 메소드에 의해 수행시킬 쿼리
	// 메소드 이름(id), 파라미터, 리턴타입(resultType)
	// 기능 : 쿼리 수행
	
}
