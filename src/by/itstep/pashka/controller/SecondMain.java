package by.itstep.pashka.controller;

import by.itstep.pashka.model.data.Student;

public class SecondMain {
    public static void main(String[] args) {
//        int a = 10;
//        int b =a;
//        a = 20;

        Student a  = new Student();
        Student b = a;
        a.name = "Alexandra";
        System.out.println(b.name);

//        Student a = new Student("Alex");
//        Student b = new Student("Alex");
    }
}
