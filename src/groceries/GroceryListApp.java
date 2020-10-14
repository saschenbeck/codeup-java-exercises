package groceries;

import util.Input;


import java.util.HashMap;

public class GroceryListApp {
    public static void main(String[] args) {
        System.out.println("Would you like to create a grocery list?");
        boolean userInput = new Input().yesNo();
        if (!userInput){
            System.out.println("OK. Have a nice day!");
            return;
        }

    }
}
