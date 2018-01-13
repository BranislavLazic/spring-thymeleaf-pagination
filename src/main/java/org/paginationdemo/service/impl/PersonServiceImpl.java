package org.paginationdemo.service.impl;

import org.paginationdemo.domain.Person;
import org.paginationdemo.repository.PersonRepository;
import org.paginationdemo.service.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Page<Person> findAllPageable(Pageable pageable) {
        return personRepository.findAll(pageable);
    }
}
