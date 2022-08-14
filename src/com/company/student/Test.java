package com.company.student;

import jdk.swing.interop.SwingInterOpUtils;

public class Test {
    public static void main(String[] args) {
        Student student= new Student();
        student.setName("Thuong");
        student.setClasses("H20");
        System.out.println(student);
        //in ra đối tượng của lớp
    }
}
