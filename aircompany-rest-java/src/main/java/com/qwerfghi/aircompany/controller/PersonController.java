package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Person;
import com.qwerfghi.aircompany.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return personService.getPersonById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find person by specified person id"));
    }

    @GetMapping
    public List<Person> getPassengers() {
        return personService.getAllPersons();
    }

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable("id") int id) {
        personService.deletePerson(id);
    }

    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") int id, @RequestBody Person person) {
        person.setPersonId(id);
        personService.updatePerson(person);
    }
}
