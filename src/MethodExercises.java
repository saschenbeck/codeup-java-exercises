import java.util.Scanner;

public class MethodExercises {
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

    public static int getInteger(int x, int y){
        Scanner userInput = new Scanner(System.in);
        int userValue = userInput.nextInt();
        if(userValue < x || userValue > y){
            System.out.print("Enter a proper number: ");
            return getInteger(x, y);
        }
            return userValue;
        // example: System.out.print("Enter a number between 1 and 10: ");
        //          int userInput = getInteger(1,10);
    }

    public static long factorial(){
        System.out.print("Enter a integer for factorial: ");
        Scanner userInput = new Scanner(System.in);
        int userValue = userInput.nextInt();
        long value = 1;
        for (int i = 1; i <= userValue; i++){
            value *= i;
        }
        System.out.println(value);
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
            System.out.print("All you had to put was \"Y\"!");
            return;
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

    public static void guessingGame(){

    }

    public static void main(String[] args) {
diceRoll();
    }
}