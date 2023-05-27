package com.mac.studentmanagementsystem.service;

import com.mac.studentmanagementsystem.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;
@Service
public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student stud);
    Student getStudentById(String id);
    Student updateStudent(Student stud);

    void deleteStudentById(String id);



}
