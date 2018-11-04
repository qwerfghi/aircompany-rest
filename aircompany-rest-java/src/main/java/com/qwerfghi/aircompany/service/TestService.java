package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.model.Person;
import com.qwerfghi.aircompany.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TestService {
    private final TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Transactional(readOnly = true)
    public Person getPersonById(int id) {
        return testRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<Person> getAllPersons() {
        return testRepository.findAll();
    }

    public void addPerson(Person plane) {
        testRepository.save(plane);
    }

    public void deletePerson(int id) {
        testRepository.delete(id);
    }

    public void updatePerson(Person plane) {
        testRepository.save(plane);
    }
}
