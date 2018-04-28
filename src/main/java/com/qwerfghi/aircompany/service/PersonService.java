package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.model.Person;
import com.qwerfghi.aircompany.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional(readOnly = true)
    public Person getPersonById(int id) {
        return personRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public void deletePerson(int id) {
        personRepository.delete(id);
    }

    public void updatePerson(Person person) {
        personRepository.save(person);
    }
}
