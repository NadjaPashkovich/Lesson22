package by.itstep.pashka.controller;

import by.itstep.pashka.model.data.Student;
import by.itstep.pashka.model.logic.Manager;

public class Controller {
    public static void main(String[] args) {

        Student student1 = new Student("Alex", 20, 7, true);
        Student student2 = new Student("Ann", 15, 6, true);
        Student student3 = new Student("Leo", 17, 9, true);

        Student[] students = {student1, student2, student3};

        double result = Manager.calcAvgStudentMark(students);


        System.out.printf("Average marks is %2.f " + result);
    }
    }

