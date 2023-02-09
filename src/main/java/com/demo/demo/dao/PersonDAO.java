package com.demo.demo.dao;

import com.demo.demo.model.Person;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDAO {
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();
    Optional<Person> selectPersonByID(UUID id);
    int deletePersonByID(UUID id);
    int updatePersonByID(UUID id, Person person);
}
