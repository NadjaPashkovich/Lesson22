package by.itstep.pashka.controller;

import by.itstep.pashka.model.data.Student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Alex", 11,7,true);
        Student student2 = new Student();
        Student student3 = new Student(student1);



        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());
    }
}
