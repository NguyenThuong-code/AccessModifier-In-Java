package com.company.calculateCircle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle= new Circle(2);
        double ra= circle.getRadius();
        System.out.println(ra);
        double ar= circle.getArea();
        System.out.println(ar);
    }
}
