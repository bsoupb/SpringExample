package com.bsoupb.spring.ex.jpa.domain;

import java.util.Date;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder(toBuilder=true)
@NoArgsConstructor // 기본 생성자 추가 
@AllArgsConstructor // 모든 멤버변수를 파라미터로 전달받아서 처리해주는 생성자
@Getter
@Table(name="new_student") // 어떤 테이블과 매칭되는지 
@Entity
public class Student {
	
	@Id // primary key 와 매칭된 멤버 변수
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	// 카멜 케이스로 정의된 컬럼은 정확한 컬럼이름 매칭
	private int id;
	private String name;

	@Column(name="phoneNumber")
	private String phoneNumber;
	private String email;
	
	@Column(name="dreamJob")
	private String dreamJob;
	
	// 자동으로 현재시간이 저장될 컬럼
	@UpdateTimestamp
	// update 될 때는 수정되지 않도록
	@Column(name="createdAt", updatable=false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name="updatedAt")
	private Date updatedAt;
	
}
