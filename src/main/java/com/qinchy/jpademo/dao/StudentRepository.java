/**
 * 
 */
package com.qinchy.jpademo.dao;

import java.util.List;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qinchy.jpademo.model.Student;

/**
 * @author Administrator
 *
 */
@Repository
@Qualifier("studentRepository")
@Table(name="student")
public interface StudentRepository extends CrudRepository<Student, Integer> {

	public List<Student> findStudentByName(String name);
	
}
