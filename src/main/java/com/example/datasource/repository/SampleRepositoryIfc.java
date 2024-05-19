package com.example.datasource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.datasource.entity.SampleEntity;


@Repository
public interface SampleRepositoryIfc extends JpaRepository<SampleEntity, Long> {

  
    // You can define custom query methods here using Spring Data JPA's method naming conventions
}