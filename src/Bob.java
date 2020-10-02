import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        boolean conversation = true;
        int counter = 0;
        Scanner userInput = new Scanner(System.in);
        do {
            if (counter == 0){
                System.out.println("Lets try talking with Bob.");
                System.out.print("You: ");
                counter++;
            }else {
                System.out.print("You: ");
                counter ++;
            }

            String userText = userInput.nextLine();
            if (userText.trim().endsWith("?")){
                System.out.println("Bob: Sure.");
            } else if (userText.trim().endsWith("!")){
                System.out.println("Bob: Whoa, chill out!");
            } else if (userText.trim().equals("")){
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Bob: Whatever.");
            }

            if (counter % 4 == 0 || counter > 4){
                System.out.println("Would you like to keep talking with Bob? [Y/N]");
                String userContinue = userInput.nextLine();
                if (userContinue.equalsIgnoreCase("N")){
                    conversation = false;
                }
            }

        } while (conversation);
    }
}
