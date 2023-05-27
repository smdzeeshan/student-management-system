package com.mac.studentmanagementsystem.service;

import com.mac.studentmanagementsystem.entity.Student;
import com.mac.studentmanagementsystem.repository.studentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private studentRepository studRepo;



    @Override
    public List<Student> getAllStudents() {

        List<Student> studLists = new ArrayList<>();
        studRepo.findAll().forEach(student -> studLists.add(student));

        return studLists;

        
    }

    @Override
    public Student saveStudent(Student stud) {
        stud.setId(UUID.randomUUID().toString());
        studRepo.save(stud);
        return stud;
    }

    @Override
    public Student getStudentById(String id) {
        Optional<Student> student  = studRepo.findById(id);
        if (student.isPresent()){
            return student.get();
        }
        else
            return new Student();
    }

    @Override
    public Student updateStudent(Student stud) {
        return studRepo.save(stud);
    }

    @Override
    public void deleteStudentById(String id) {
        studRepo.deleteById(id);
    }


}
