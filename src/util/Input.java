package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    String getString(){
        String userInput = scanner.nextLine();
        String output = String.format("The userInput was : %s", userInput);
        return output;
    }

    boolean yesNo(){
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }
}
