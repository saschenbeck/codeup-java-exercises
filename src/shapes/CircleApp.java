package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.print("Enter the radius of your circle: ");
        double userRadius = userInput.getDouble();
        Circle userCircle = new Circle(userRadius);
        System.out.printf("Your circle has an area of %s units^2.\n", userCircle.getArea());
        System.out.printf("Your circle has a circumference of %s units.\n", userCircle.getCircumference());
    }
}
