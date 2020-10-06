package shapes;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the radius of your circle: ");
        double userRadius = userInput.nextDouble();
        Circle userCircle = new Circle(userRadius);
        System.out.printf("Your circle has an area of %s units^2.\n", userCircle.getArea());
        System.out.printf("Your circle has a circumference of %s units.\n", userCircle.getCircumference());
    }
}
