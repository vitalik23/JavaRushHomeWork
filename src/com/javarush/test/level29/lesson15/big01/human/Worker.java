package com.javarush.test.level29.lesson15.big01.human;

public class Worker extends Human{

    private double salary;
    public String company;

    public Worker(String name, int age) {
        super(name,age);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
