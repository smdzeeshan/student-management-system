package com.mac.studentmanagementsystem;

import com.mac.studentmanagementsystem.entity.Student;
import com.mac.studentmanagementsystem.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.rmi.server.UID;
import java.util.UUID;

@SpringBootApplication
@EnableAutoConfiguration
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}


}
