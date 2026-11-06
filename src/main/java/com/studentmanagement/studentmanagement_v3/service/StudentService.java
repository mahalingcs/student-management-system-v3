package com.studentmanagement.studentmanagement_v3.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.studentmanagement.studentmanagement_v3.entity.Student;
import com.studentmanagement.studentmanagement_v3.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {

        if (studentRepository.existsById(student.getRollNo())) {
            throw new StudentAlreadyExistsException(
                    "Student already exists with roll number: "
                            + student.getRollNo());
        }

        return studentRepository.save(student);
    }

    public Student updateStudent(int rollNo, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(rollNo)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setAge(updatedStudent.getAge());

        return studentRepository.save(existingStudent);
    }

    public void deleteStudent(int rollNo) {

        if (!studentRepository.existsById(rollNo)) {
            throw new RuntimeException("Student not found");
        }

        studentRepository.deleteById(rollNo);
    }

    public Student getStudentByRollNo(int rollNo) {
        return studentRepository.findById(rollNo)
                .orElseThrow(() -> new StudentNotFoundException(
                        "Student not found with roll number: " + rollNo));
    }

}
