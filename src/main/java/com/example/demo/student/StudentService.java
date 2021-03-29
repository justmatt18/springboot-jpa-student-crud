package com.example.demo.student;


import java.util.List;
import java.util.Optional;

public interface StudentService {
    List <Student> list();

    Optional<Student> getStudent(Long id);

    Student newStudent(Student student);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);

    List<Student> findStudentsByAge(int age);

    Optional<Student> findStudentByEmail(String email);

    Boolean studentHasExist(Long id);

}
