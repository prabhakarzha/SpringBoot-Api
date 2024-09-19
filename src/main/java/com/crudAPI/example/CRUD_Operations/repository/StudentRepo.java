package com.crudAPI.example.CRUD_Operations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudAPI.example.CRUD_Operations.entity.Students;

@Repository
public interface StudentRepo extends JpaRepository<Students, Integer> {

}
