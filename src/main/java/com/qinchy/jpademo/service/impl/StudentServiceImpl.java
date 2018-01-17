/**
 * 
 */
package com.qinchy.jpademo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qinchy.jpademo.dao.StudentRepository;
import com.qinchy.jpademo.model.Student;
import com.qinchy.jpademo.service.StudentService;

/**
 * @author Administrator
 *
 */
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	/* (non-Javadoc)
	 * @see com.qinchy.jpademo.service.StudentService#findStudentByName(java.lang.String)
	 */
	@Override
	public List<Student> findStudentByName(String name) {
		return studentRepository.findStudentByName(name);
	}

}
