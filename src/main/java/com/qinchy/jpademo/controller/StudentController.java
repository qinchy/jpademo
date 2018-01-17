/**
 * 
 */
package com.qinchy.jpademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qinchy.jpademo.model.Student;
import com.qinchy.jpademo.service.StudentService;

/**
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/findStudentByName")
	public List<Student> findStudentByName(@RequestParam("name") String name){
		return studentService.findStudentByName(name);
	}
}
