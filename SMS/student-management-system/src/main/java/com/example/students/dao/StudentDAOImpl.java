package com.example.students.dao;
package com.example.students.model.Student;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String user = "root";
    private static final String PASSWORD = "";

    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, user, PASSWORD);
    }

    @Override
    public void addStudent(Student student)
    {

    }

    @Override
    public void getStudentById(int id)
    {
        
    }

    @Override
    public List<Student> getAllStudents()
    {
        
    }

    @Override
    public void updateStudent(Student student)
    {
        
    }

    @Override
    public void deleteeStudent(int id)
    {
        
    }
}
