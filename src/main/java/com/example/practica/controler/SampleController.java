package com.example.practica.controler;


import com.example.practica.domain.Person;
import com.example.practica.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @PostMapping()
    public Person insert(@RequestBody Person person){
        return sampleService.insert(person);
    }

    @GetMapping(value = "/{id}")
    public Person getById(@PathVariable("id") Long id) throws Exception {
        return sampleService.getById(id).orElseThrow(() -> new Exception("Not found"));
    }

}
