package com.example.students.model;

public class Student{

    private int id;
    private String name;
    private int age;
    private String course;



    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    @Override
    public String toString(){
        return "Student [ID="+id+", Name="+name+", Age="+age+", Course = "+course+"]";
    }

    
}