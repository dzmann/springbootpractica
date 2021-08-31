package com.example.practica.service;

import com.example.practica.domain.Person;
import com.example.practica.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleRepository repository;

    @Override
    public Person insert(Person person) {
        return repository.save(person);
    }

    @Override
    public Optional<Person> getById(long id) {
        return repository.findById(id);
    }
}
