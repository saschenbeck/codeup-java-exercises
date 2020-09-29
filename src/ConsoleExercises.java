import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n",pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.println("Please enter an integer.");
        int userInput = scanner.nextInt();
        System.out.printf("Looks like you entered %s.\n", userInput);

        System.out.println("Bit of an odd question, what are your three favorite words?");
        String userFirstWord = scanner.next();
        String userSecondWord = scanner.next();
        String userThirdWord = scanner.next();
        System.out.printf("Interesting, I would have never guessed %s, %s, and %s.\n", userFirstWord, userSecondWord, userThirdWord);

        System.out.println("Next one, what is your favorite quote?");
        String userQuote = scanner.next();
        scanner.nextLine();
        System.out.printf("\"%s\" is quite the quote.\n", userQuote);

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the length of the room you are working in via ft?");
        String roomLength = scan.nextLine();
        double length = Double.parseDouble(roomLength);

        System.out.println("What is the width of the room you are working in via ft?");
        String roomWidth = scan.nextLine();
        double width = Double.parseDouble(roomWidth);

        System.out.println("What is the height of the room you are working in via ft?");
        String roomHeight = scan.next();
        double height = Double.parseDouble((roomHeight));

        System.out.printf("So your workspace is %s ft long, %s ft wide, and %s ft tall.\n", roomLength, roomWidth, roomHeight);
        System.out.printf("That would mean approximately your workspace has a perimeter of %.2f ft, an area of %.2f square ft, and a volume of %.2f ft.", 2*(length+width), (length*width), (length*width*height));
    }
}
