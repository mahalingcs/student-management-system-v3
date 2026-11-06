package com.studentmanagement.studentmanagement_v3.repository;

import com.studentmanagement.studentmanagement_v3.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//here  StudentRepository and JpaRepository both are interfaces we need the methods like save(),findAll(),findById()
//from JpaRepository if instead extends if i use "implements" i need to manually implement all the methods
//as i am using spring it scans and spring data jpa do the implementation behind the scene and makes all the methods are availble
//You don't need to create an implementation class yourself. 
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
