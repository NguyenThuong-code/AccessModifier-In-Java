package com.company.student;

public class Student {
    private String name="John";
    private String classes= "CO2";
    Student(){}
     void setName(String name){
        this.name= name;
    }
     void setClasses(String classes){
        this.classes=classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
