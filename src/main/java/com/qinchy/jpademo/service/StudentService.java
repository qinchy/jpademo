/**
 * 
 */
package com.qinchy.jpademo.service;

import java.util.List;

import com.qinchy.jpademo.model.Student;

/**
 * @author Administrator
 *
 */
public interface StudentService {
	public List<Student> findStudentByName(String name);
}
