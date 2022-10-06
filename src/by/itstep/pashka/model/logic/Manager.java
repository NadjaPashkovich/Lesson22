package by.itstep.pashka.model.logic;
import by.itstep.pashka.model.data.Student;

public class Manager {
    public static double calcAvgStudentMark(Student[] students) {
        double s = 0;
        for (Student student: students) {
            s += student.mark;

        }

        return s/students.length;
    }

}
