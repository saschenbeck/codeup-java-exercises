import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        boolean conversation = true;
        Scanner userInput = new Scanner(System.in);
        do {
            System.out.println("Lets try talking with Bob.");
            String userText = userInput.nextLine();
            if (userText.endsWith("?")){
                System.out.println("You: " + userText);
                System.out.println("Bob: Sure.");
            }

            System.out.println("Would you like to keep talking with Bob? [Y/N]");
            String userContinue = userInput.nextLine();
            if (userContinue.equalsIgnoreCase("N")){
                conversation = false;
            }
        } while (conversation);
    }
}
