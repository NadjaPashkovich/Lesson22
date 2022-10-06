package by.itstep.pashka.model.data;

public class Student {
    public String name;
    public int age;
    public double mark;
    public boolean alive;

    //    default constructor
    public Student() {
        name = "Leo";
        age = 18;
        mark = 9;
        alive = true;
    }
//        constructor with params
        public Student(String name, int age, double mark ,boolean alive){
            this.name  = name;
            this.age = age;
            this.mark = mark;
            this.alive = alive;
        }

    public Student(String n){
        name  = n;

    }

    public Student(Student student){
        name = student.name;
        age = student.age;
        mark = student.mark;
        alive = student.alive;
    }

    public String getInfo() {
        return name + ": age " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "no");
    }
}
