package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.model.Person;

@Service
public class PersonService {

    private final Map<Long, Person> personStore = new HashMap<>();
    
   
    public Person getPersonWithDept(Long id) {
        Person person = personStore.get(id);
       
        return person;
    }

    public Person savePerson(Person person) {
        personStore.put(person.getId(), person);
        return person;
    }

	/*
	 * public Person getPerson(Long id) { return personStore.get(id); }
	 */

    public List<Person> getAllPersons() {
        return new ArrayList<>(personStore.values());
    }

    public Person updatePerson(Long id, Person person) {
        person.setId(id);
        personStore.put(id, person);
        return person;
    }

    public void deletePerson(Long id) {
        personStore.remove(id);
    }
}
