package grades;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
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

    public void recordAttendance(String date_Year_Month_Day, String value_P_or_A) {
        if (value_P_or_A.equalsIgnoreCase("A") || value_P_or_A.equalsIgnoreCase("P")){
            this.attendance.putIfAbsent(date_Year_Month_Day,value_P_or_A);
        }else {
            System.out.println("Enter an appropriate value");
            recordAttendance(date_Year_Month_Day, value_P_or_A);
        }
    }

    public double attendancePercentage(){
        double numberOfDays = this.attendance.size();
        double numberOfAbsences = 0;
        for (String date: this.attendance.keySet()){
            if(this.attendance.get(date).equalsIgnoreCase("A")){
                numberOfAbsences += 1;
            }
        }
        return ((numberOfDays - numberOfAbsences) / numberOfDays) * 100;
    }

    public ArrayList numberOfAbsences(){
        ArrayList<String> absences = new ArrayList<>();
        for (String date : this.attendance.keySet()){
            if (this.attendance.get(date).equalsIgnoreCase("A")){
                absences.add(date);
            }
        }
        return absences;
    }




//    public static void main(String[] args) {
//        Student skyler = new Student("Skyler");
//        System.out.println("skyler.getName() = " + skyler.getName());
//        skyler.addGrade(99);
//        skyler.addGrade(98);
//        skyler.addGrade(97);
////        System.out.println("skyler.grades = " + skyler.grades);
//        System.out.println("skyler.getGradeAverage() = " + skyler.getGradeAverage());
//    }
}
