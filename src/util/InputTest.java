package util;

public class InputTest {
    public static void main(String[] args) {
        Input userInput = new Input();
//        System.out.println(userInput.getString());
//        System.out.println(userInput.yesNo());
//        userInput.getInt(1,10);
        userInput.getString();
        userInput.yesNo();
        userInput.getInt(1,10);
        userInput.getDouble(1,20);
    }
}
