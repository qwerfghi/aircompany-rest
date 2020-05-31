package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
