package com.olx.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olx.beans.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {

}
