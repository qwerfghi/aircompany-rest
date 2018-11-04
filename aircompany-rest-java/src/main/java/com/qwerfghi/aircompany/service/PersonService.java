package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.PersonDTO;
import com.qwerfghi.aircompany.repository.dto.PersonDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonService {
    private final PersonDTORepository personDTORepository;

    @Autowired
    public PersonService(PersonDTORepository personDTORepository) {
        this.personDTORepository = personDTORepository;
    }

    @Transactional(readOnly = true)
    public PersonDTO getPersonById(int id) {
        return personDTORepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<PersonDTO> getAllPersons() {
        return personDTORepository.findAll();
    }

    public void addPerson(PersonDTO personDTO) {
        personDTORepository.save(personDTO);
    }

    public void deletePerson(int id) {
        personDTORepository.delete(id);
    }

    public void updatePerson(PersonDTO personDTO) {
        personDTORepository.save(personDTO);
    }
}
