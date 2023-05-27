package com.mac.studentmanagementsystem.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @Builder
@Entity
@Table(name = "students")
public class Student {
    @Column(nullable = false)
    @Id
    private String id;

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @Column(nullable = false)
    private String email;


}
