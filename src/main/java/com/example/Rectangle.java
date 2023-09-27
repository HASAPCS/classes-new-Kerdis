package com.example;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        // TODO: Initialize the length and width
        this.length = length;
        this.width = width;
    }

    public double area() {
        // TODO: Calculate and return the area of the rectangle
        double area = this.length*this.width;
        return area;  // Change this default return statement
    }

    public double perimeter() {
        // TODO: Calculate and return the perimeter of the rectangle
        double perimeter = this.length*2+this.width*2;
        return perimeter;  // Change this default return statement
    }
}
