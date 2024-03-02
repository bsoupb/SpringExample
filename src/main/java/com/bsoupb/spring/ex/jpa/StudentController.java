package com.bsoupb.spring.ex.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bsoupb.spring.ex.jpa.domain.Student;
import com.bsoupb.spring.ex.jpa.repository.StudentRepository;
import com.bsoupb.spring.ex.jpa.service.StudentService;

@RequestMapping("/jpa/student")
@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	// Controller에서는 Repository 객체 사용 금지
	// 편의를 위해 잠시 사용
	@Autowired
	private StudentRepository studentRepository;
	
	
	
	@GetMapping("/create")
	@ResponseBody
	public Student createStudent(){
		
		// 김가나, 010-1234-5678, kim@naver.com, 개발자
		Student student = studentService.addStudent("김가나", "010-1234-5678", "kim@naver.com", "개발자");
		return student;
	}
	
	
	@GetMapping("/update")
	@ResponseBody
	public Student updateStudent() {
		// id가 3인 학생정보의 장래희망을 강사로 변경;
		Student student = studentService.updateStudent(4,  "개발자");
		return student;
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public String deleteStudent() {
		// id가 3인 학생 정보 삭제
		studentService.deleteStudent(3);
		return "삭제 성공";
	}
	
	@GetMapping("/select")
	@ResponseBody
	public List<Student> selectStudent() {
		
		// 모든 행 조회
//		List<Student> studentList = studentRepository.findAll();
		
//		List<Student> studentList = studentRepository.findAllByOrderByIdDesc();
		
//		List<Student> studentList = studentRepository.findTop1ByOrderByIdDesc();
		
//		List<Student> studentList = studentRepository.findByName("조세호");
		
//		List<String> nameList = new ArrayList<>();
//		nameList.add("유재석");
//		nameList.add("조세호");
//		
//		List<Student> studentList = studentRepository.findByNameIn(nameList);
		
//		List<Student> studentList = studentRepository.findByEmailContaining("naver");
		
//		List<Student> studentList = studentRepository.findByIdBetweenOrderByIdDesc(1, 7);
		
		List<Student> studentList = studentRepository.findByDreamJobQuery("모델");
		
		
		return studentList;
		
	}
	
	
	
	
	
	@GetMapping("/jpa/lombok/test")
	@ResponseBody
	public Student lombokTest() {
		
//		Student student = new Student(0, "김가나", "010-1234-5678", "kim@naver.com", "개발자", null, null);
//		student.setName("김가나");
//		student.setDreamJob("개발자");
//		student.setPhoneNumber("010-1234-5678");
//		student.setEmail("kim@naver.com");
		Student student = Student.builder()
								.name("김가나")
								.dreamJob("개발자")
								.phoneNumber("010-1234-4567")
								.email("kim@naver.com")
								.build();
		
		
		return student;
		
	}
	
	
}
