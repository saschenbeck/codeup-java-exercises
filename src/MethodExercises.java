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

    public static int getInteger(int min, int max){
        System.out.printf("Enter a number between %s and %s: ", min, max);
        Scanner userInput = new Scanner(System.in);
        int userValue = userInput.nextInt();
        if(userValue < min || userValue > max){
            System.out.print("Enter a proper number!\n");
            return getInteger(min, max);
        }
        System.out.printf("Your number, %s, falls within the parameters set.", userValue);
            return userValue;
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
        Scanner userInput = new Scanner(System.in);
        System.out.print("Pick a number between 1 and 100: ");
        int userValue = userInput.nextInt();
        int min = 1;
        int max = 100;
        int randomNumber = (int) Math.floor(Math.random() * max) + min;
        int numberOfGuesses = 0;
        while (userValue != randomNumber){
            if(numberOfGuesses == 11){
                System.out.println("YOU HAVE EXCEEDED THE VALID ATTEMPTS!");
                System.out.print("Would you like to try again? [Y/N]");
                String playAgain = userInput.next();
                if (playAgain.equalsIgnoreCase("y")){
                    guessingGame();
                }
                return;
            }
            if (userValue < randomNumber){
                System.out.println("HIGHER");
                numberOfGuesses += 1;
                System.out.printf("# of guesses: %s\n", numberOfGuesses);
                System.out.print("Guess Again: ");
                userValue = userInput.nextInt();
            }
            if (userValue > randomNumber){
                System.out.println("LOWER");
                numberOfGuesses += 1;
                System.out.printf("# of guesses: %s\n", numberOfGuesses);
                System.out.print("Guess Again: ");
                userValue = userInput.nextInt();
            }
            if(userValue == randomNumber){
                System.out.println("GOOD GUESS!");
                numberOfGuesses +=1;
                if (numberOfGuesses == 1){
                    System.out.println("360 No scope 1st try\n");
                } else {
                    System.out.printf("It only took you %s times\n", numberOfGuesses);
                }
                System.out.print("Would you like to try again? [Y/N]");
                String playAgain = userInput.next();
                if (playAgain.equalsIgnoreCase("y")){
                    guessingGame();
                }
                return;
            }

        }
    }

    public static void main(String[] args) {
        int input = getInteger(1,10);
    }
}