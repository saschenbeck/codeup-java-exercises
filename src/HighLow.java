import java.util.Scanner;

public class HighLow {
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
        guessingGame();
    }
}
