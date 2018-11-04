package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Person;
import com.qwerfghi.aircompany.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return testService.getPersonById(id);
    }

    @GetMapping
    public List<Person> getPersons() {
        return testService.getAllPersons();
    }
}
