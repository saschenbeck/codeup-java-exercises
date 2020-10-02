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

    public static void main(String[] args) {
        factorial();
    }
}