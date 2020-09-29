import java.io.PrintStream;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        System.out.print("Hello,");
//        System.out.println(" World!");
//
//        int myFavoriteNumber = 13;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "This is my string";
//        System.out.println(myString);
//
//        float myNumber = 3.14F;
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
//
//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
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

        System.out.printf("So your workspace is %s ft long and %s ft wide.\n", roomLength, roomWidth);
        System.out.printf("That would mean your workspace has a perimeter of %.2f ft, an area of %.2f square ft, and a volume of %.2f ft.", 2*(length+width), (length*width), (length*width*height));
    }
}
