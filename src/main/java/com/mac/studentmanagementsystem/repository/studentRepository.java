package com.mac.studentmanagementsystem.repository;

import com.mac.studentmanagementsystem.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends CrudRepository<Student, String> {

}
