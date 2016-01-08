package org.paginationdemo.service.impl;

import org.paginationdemo.domain.Person;
import org.paginationdemo.repository.PersonRepository;
import org.paginationdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService {

	private PersonRepository personRepository;

	@Autowired
	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Transactional
	@Override
	public Page<Person> findAllPageable(Pageable pageable) {
		return personRepository.findAll(pageable);
	}

	@Transactional
	@Override
	public Iterable<Person> save(Iterable<Person> persons) {
		return personRepository.save(persons);
	}

}
