import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        int output = 0;
        for (int i = 1; i <= y; i++){
            output += x;
        }
        return output;
    }

    public static float division(float x, float y) {
        float value = x / y;
        return value;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }

    public static int getInteger(int min, int max){
        System.out.printf("Enter a number between %s and %s: ", min, max);
        Scanner userInput = new Scanner(System.in);
        int userValue = userInput.nextInt();
        if(userValue < min || userValue > max){
            System.out.print("Enter a proper number!\n");
            return getInteger(min, max);
        }
        System.out.printf("Your number, %s, falls within the parameters set.\n", userValue);
            return userValue;
    }

    public static long factorial(){
        int userValue = getInteger(1,10);
        long value = 1;
        for (int i = 1; i <= userValue; i++){
            value *= i;
        }
        System.out.printf("%s! = %s\n", userValue, value);
        System.out.print("Would you like to try another [Y/N]: ");
        Scanner userInput = new Scanner(System.in);
        String userConfirm = userInput.next();
        if (userConfirm.equalsIgnoreCase("y")){
            factorial();
        }
        return value;
    }

    public static void diceRoll(){
        Scanner userInput = new Scanner(System.in);
        userInput.useDelimiter("\n");

        //Number of sides
        System.out.print("How many sides should our dice have?: ");
        int userValue = userInput.nextInt();

        //User confirms to roll
        System.out.print("Lets Roll! [y]: ");
        String userRoll = userInput.next();
        if (!(userRoll.equalsIgnoreCase("y"))){
            System.out.println("All you had to put was \"Y\"!\nIf you won't roll them, then I will!");
        }

        //Rolling
        System.out.println("*insert rolling sounds*");
        int min = 1;
        int max = userValue;
        for (int i = 1; i <= 2; i++){
            int diceRoll = (int) Math.floor(Math.random() * max) + min;
            System.out.printf("Dice %s Value: " + diceRoll + "\n", i);
        }

        //Roll Again?
        System.out.print("Would you like to roll again? [Y/N]: ");
        String userConfirm = userInput.next();
        if (userConfirm.equalsIgnoreCase("y")){
            diceRoll();
        }

    }


    public static void main(String[] args) {
        factorial();
    }
}