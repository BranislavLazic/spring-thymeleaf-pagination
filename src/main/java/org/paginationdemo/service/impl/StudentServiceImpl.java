package org.paginationdemo.service.impl;

import org.paginationdemo.domain.Student;
import org.paginationdemo.repository.StudentRepository;
import org.paginationdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Transactional
	@Override
	public Page<Student> findAllPageable(Pageable pageable) {
		return studentRepository.findAll(pageable);
	}

	@Transactional
	@Override
	public Iterable<Student> save(Iterable<Student> students) {
		return studentRepository.save(students);
	}

}
