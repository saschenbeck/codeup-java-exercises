package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double gradeTotal = 0;
        for (double grade: this.grades){
            gradeTotal += grade;
        }
        return gradeTotal / this.grades.size();
    }

    public static void main(String[] args) {
        Student skyler = new Student("Skyler");
        System.out.println("skyler.getName() = " + skyler.getName());
        skyler.addGrade(99);
        skyler.addGrade(98);
        skyler.addGrade(97);
        System.out.println("skyler.grades = " + skyler.grades);
        System.out.println("skyler.getGradeAverage() = " + skyler.getGradeAverage());
    }
}
