package com.mac.studentmanagementsystem.controller;

import com.mac.studentmanagementsystem.entity.Student;
import com.mac.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelExtensionsKt;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String getAllStudents(Model model) {

        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }
    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";

    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute ("student") Student student ){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable String id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }


    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable String id, @ModelAttribute ("student") Student student){

        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        studentService.updateStudent(existingStudent);
        return "redirect:/students";


    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable String id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
