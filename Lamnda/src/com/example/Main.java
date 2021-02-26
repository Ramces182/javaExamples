package com.example;

import javax.swing.text.html.ListView;
import java.awt.image.renderable.RenderableImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Thread(()-> {
            System.out.println("Printing from the runnable");
            System.out.println("Line 2");
            System.out.format("This is Line %d\n", 3);
        }).start();


        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim", 21);
        Employee jack = new Employee("Jack", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        Collections.sort(employees, (Employee employee1, Employee employee2));
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}