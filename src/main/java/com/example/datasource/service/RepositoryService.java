package com.example.datasource.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.datasource.entity.SampleEntity;
import com.example.datasource.repository.SampleRepository;
import com.example.datasource.repository.SampleRepositoryIfc;

@Service
public class RepositoryService {

    private final SampleRepository sampleRepository;

 
   
    
    
 
    @Autowired
    public RepositoryService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
 
    }

   
    
 
    public SampleEntity createUser(SampleEntity user) {
        return ((CrudRepository<SampleEntity, Long>) sampleRepository).save(user);
    }

     

 
    public List<SampleEntity> getAllSamples() {
        System.out.println(sampleRepository.findAll());
        return sampleRepository.findAll();

    }

    public String check() {
        return "sampleRepository.findAll()";
    }

    // Other methods
}