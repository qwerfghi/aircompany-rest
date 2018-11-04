package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.dto.PersonDTO;
import com.qwerfghi.aircompany.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public PersonDTO getPerson(@PathVariable("id") int id) {
        return personService.getPersonById(id);
    }

    @GetMapping
    public List<PersonDTO> getPassengers() {
        return personService.getAllPersons();
    }

    @PostMapping
    public void addPerson(@RequestBody PersonDTO personDTO) {
        personService.addPerson(personDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable("id") int id) {
        personService.deletePerson(id);
    }

    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") int id, @RequestBody PersonDTO personDTO) {
        personDTO.setPersonId(id);
        personService.updatePerson(personDTO);
    }
}