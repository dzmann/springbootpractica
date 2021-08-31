package com.example.practica.service;

import com.example.practica.domain.Person;

import java.util.Optional;

public interface SampleService {

    Person insert(Person person);

    Optional<Person> getById(long id);

}
