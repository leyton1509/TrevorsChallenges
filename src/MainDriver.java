

import ArrayChallenge.ArrayDriver;
import MethodsChallenge.MethodsDriver;

import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.print("\nChallenges Menu\n" +
                "1. Array Challenge\n" +
                "2. Methods Challenge\nEnter Challenge Number:");


        String menuInput = myObj.nextLine().toLowerCase();  // Read user input

        switch(menuInput){
            case "1":
                ArrayDriver arrayDriver = new ArrayDriver();
                break;
            case "2":
                MethodsDriver methodsDriver = new MethodsDriver();
                break;
            default:
                System.out.println("Not recognised");
        }
    }
}
