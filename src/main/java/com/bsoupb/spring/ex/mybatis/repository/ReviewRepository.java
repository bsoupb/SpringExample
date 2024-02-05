package com.bsoupb.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.bsoupb.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewRepository {
	
	// id가 3인 행 조회 리턴
	public Review selectReview(@Param("id") int id); // int id : 자바 문법 @Param(xml에서 사용될 키워드) 
}
