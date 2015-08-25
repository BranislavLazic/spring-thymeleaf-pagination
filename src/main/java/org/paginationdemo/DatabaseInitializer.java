package org.paginationdemo;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.paginationdemo.domain.Student;
import org.paginationdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer {

	private StudentService studentService;

	@Autowired
	public DatabaseInitializer(StudentService studentService) {
		this.studentService = studentService;
	}

	@PostConstruct
	public void populateDatabase() {
		Student firstStudent = new Student("Barack", "Obama", 40);
		Student secondStudent = new Student("Vladimir", "Putin", 50);
		Student thirdStudent = new Student("Jong", "Kim Un", 30);

		studentService.save(Arrays.asList(firstStudent, secondStudent, thirdStudent));
	}

}
