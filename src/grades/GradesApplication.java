package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> usernames = new HashMap<>();

        Student midoriya = new Student("Midoriya");
        midoriya.addGrade(90);
        midoriya.addGrade(89);
        midoriya.addGrade(91);
        midoriya.recordAttendance("2020-10-13", "P");
        midoriya.recordAttendance("2020-10-12", "A");
        midoriya.recordAttendance("2020-10-11", "P");

        Student lida = new Student("Lida");
        lida.addGrade(95);
        lida.addGrade(95);
        lida.addGrade(95);
        lida.recordAttendance("2020-10-13", "P");
        lida.recordAttendance("2020-10-12", "P");
        lida.recordAttendance("2020-10-11", "P");

        Student bakugo = new Student("Bakugo");
        bakugo.addGrade(91);
        bakugo.addGrade(90);
        bakugo.addGrade(92);
        bakugo.recordAttendance("2020-10-13", "A");
        bakugo.recordAttendance("2020-10-12", "A");
        bakugo.recordAttendance("2020-10-11", "A");

        Student kirshima = new Student("Kirishima");
        kirshima.addGrade(87);
        kirshima.addGrade(88);
        kirshima.addGrade(93);
        kirshima.recordAttendance("2020-10-13", "A");
        kirshima.recordAttendance("2020-10-12", "P");
        kirshima.recordAttendance("2020-10-11", "A");

        usernames.putIfAbsent("deku", midoriya);
        usernames.putIfAbsent("ingenium", lida);
        usernames.putIfAbsent("lord-explosion", bakugo);
        usernames.putIfAbsent("red-riot", kirshima);

        System.out.println("Welcome!");
        System.out.println("Here is a list of Class 1-A Heroes:");
        for (String hero: usernames.keySet()){
            System.out.print("|" + hero.toUpperCase() + "| ");
        }
        System.out.println();
        moreInfo(usernames);


    }

    public static void moreInfo(HashMap list){
        System.out.print("What hero would you like to see more info on?: ");
        Scanner userInput = new Scanner(System.in);
        String userSelection = userInput.nextLine().trim().toLowerCase();
        if (list.containsKey(userSelection)){
            Student chosenStudent = (Student) list.get(userSelection);
            System.out.printf("Name: %s - Hero Name: %s\n", chosenStudent.getName(), userSelection.toUpperCase());
            System.out.printf("Current Average: %s\n", chosenStudent.getGradeAverage());
            System.out.println("Current Attendance Percentage: "  + chosenStudent.attendancePercentage() + "%");
            System.out.println("Days absent: " + chosenStudent.numberOfAbsences());
        } else {
            System.err.printf("Sorry, no hero named %s was found\n", userSelection.toUpperCase());
        }
        System.out.println();
        System.out.print("Would you like to see another hero? [Y/N]: ");
        String userConfirm = userInput.next().trim();
        if (userConfirm.equalsIgnoreCase("Y")){
            System.out.println();
            moreInfo(list);
        }

    }
}
