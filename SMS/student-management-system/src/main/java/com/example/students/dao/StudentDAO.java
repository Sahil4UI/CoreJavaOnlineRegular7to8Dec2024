package com.example.students.dao;

public interface StudentDAO {

    void addStudent(Student student)  ;
    Student getStudentById(int id);
    List<Student> getAllStudents();
    void updateStudent(Student student);
    void deleteStudent(int id);  
    
}
