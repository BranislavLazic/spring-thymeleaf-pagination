package org.paginationdemo.service;

import org.paginationdemo.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonService {

	/**
	 * Finds a "page" of students
	 * 
	 * @param pageable
	 * @return {@link Page} instance
	 */
	Page<Person> findAllPageable(Pageable pageable);

	/**
	 * Saves collection of students
	 * 
	 * @param students
	 * 
	 * @return collection of students
	 */
	Iterable<Person> save(Iterable<Person> students);

}
