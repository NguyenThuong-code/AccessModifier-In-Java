package com.company.calculateCircle;

public class Circle {
    private double radius= 1.0;
    private String color ="red";
    //thuộc tính mặc định của một đối tượng
    Circle(double r){
        radius=r;
    }
    //constructor khởi tạo thuộc tính cho một đối tượng.
    //với các đối tượng khác nhau thì thuộc tính truyền vào cho đơi tượng khác nhau
    protected double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

}
