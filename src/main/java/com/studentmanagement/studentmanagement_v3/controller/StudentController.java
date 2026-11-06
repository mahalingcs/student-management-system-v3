package com.studentmanagement.studentmanagement_v3.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.studentmanagement.studentmanagement_v3.entity.Student;
import com.studentmanagement.studentmanagement_v3.service.StudentService;
import jakarta.validation.Valid;//validation import

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/api/students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/api/students/{rollNo}")
    public Student getStudentByRollNo(@PathVariable int rollNo) {
        return studentService.getStudentByRollNo(rollNo);
    }

    @PostMapping("/api/students")
    public Student addStudent(@Valid @RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/api/students/{rollNo}")
    public Student updateStudent(
            @PathVariable int rollNo,
            @Valid @RequestBody Student student) {

        return studentService.updateStudent(rollNo, student);
    }

    @DeleteMapping("/api/students/{rollNo}")
    public String deleteStudent(@PathVariable int rollNo) {

        studentService.deleteStudent(rollNo);

        return "Student deleted successfully";
    }

}