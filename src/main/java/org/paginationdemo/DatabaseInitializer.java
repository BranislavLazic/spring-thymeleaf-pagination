package org.paginationdemo;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.paginationdemo.domain.Person;
import org.paginationdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer {

	private PersonService personService;

	@Autowired
	public DatabaseInitializer(PersonService studentService) {
		this.personService = studentService;
	}

	@PostConstruct
	public void populateDatabase() {
		Person firstPerson = new Person("Barack", "Obama", 40);
		Person secondPerson = new Person("Vladimir", "Putin", 50);
		Person thirdPerson = new Person("Jong", "Kim Un", 30);

		personService.save(Arrays.asList(firstPerson, secondPerson, thirdPerson));
	}

}
