package com.example.datasource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.datasource.entity.SampleEntity;
import com.example.datasource.service.RepositoryService;

@RestController
public class DemoController {

    @Autowired
    RepositoryService repositoryService;

    @GetMapping("/samples")
    public String getAllSamples() {
        try {
            List<SampleEntity> list = repositoryService.getAllSamples();
            return list.toString();
        } catch (Exception e) {
            return "Error fetching samples: " + e.getMessage();
        }
    }

    @GetMapping("/addsamples")
    public String addSample() {
        try {
            Long id=(long) 1;
            SampleEntity sample = new SampleEntity(id, "Kamal", 100);
            repositoryService.createUser(sample);
            return "Sample added successfully";
        } catch (Exception e) {
            return "Error adding sample: " + e.getMessage();
        }
    }

    @GetMapping("/sample")
    public String getSampleEndpoint() {
        return "usumbu larisae";
    }
}
