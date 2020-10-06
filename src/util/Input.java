package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    String getString(){
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();
        String output = String.format("The userInput was : %s", userInput);
        return output;
    }

    boolean yesNo(){
        System.out.print("Yes or No: ");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    int getInt(int min, int max){
        System.out.printf("Enter a number between %s and %s: ", min, max);
        Scanner userInput = new Scanner(System.in);
        int userValue = userInput.nextInt();
        if(userValue < min || userValue > max){
            System.out.print("Enter a proper number!\n");
            return getInt(min, max);
        }
        System.out.printf("Your number, %s, falls within the parameters set.\n", userValue);
        return userValue;
    }

    int getInt(){
        int userInt = scanner.nextInt();
        return userInt;
    }
    double getDouble(double min, double max){
        System.out.printf("Enter a number between %s and %s: ", min, max);
        Scanner userInput = new Scanner(System.in);
        double userValue = userInput.nextDouble();
        if(userValue < min || userValue > max){
            System.out.print("Enter a proper number!\n");
            return getDouble(min, max);
        }
        System.out.printf("Your number, %s, falls within the parameters set.\n", userValue);
        return userValue;
    }

    double getDouble(){
        double userDouble = scanner.nextDouble();
        return userDouble;
    }
}
