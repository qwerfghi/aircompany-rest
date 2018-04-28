package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.PersonDTO;
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
    public PersonDTO getPersonById(int id) {
        return personRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<PersonDTO> getAllPersons() {
        return personRepository.findAll();
    }

    public void addPerson(PersonDTO personDTO) {
        personRepository.save(personDTO);
    }

    public void deletePerson(int id) {
        personRepository.delete(id);
    }

    public void updatePerson(PersonDTO personDTO) {
        personRepository.save(personDTO);
    }
}
