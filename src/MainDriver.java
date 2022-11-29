import ArrayChallenge.ArrayDriver;
import ClassChallenge.ClassDriver;
import MethodsChallenge.MethodsDriver;

import java.util.Scanner;

/**
 * Main driver to run the program
 */
public class MainDriver {

    /**
     * @param args no arguments needed
     */

    public static void main(String[] args) {

        // Gets which challenge to run

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.print("\nChallenges Menu\n" +
                "1. Array Challenge\n" +
                "2. Methods Challenge\n" +
                "3. Classes Challenge\n" +
                "Enter Challenge Number:");

        String menuInput = myObj.nextLine().toLowerCase();  // Read user input

        // Runs the necassary challenge

        switch(menuInput){
            case "1":
                ArrayDriver arrayDriver = new ArrayDriver();
                break;
            case "2":
                MethodsDriver methodsDriver = new MethodsDriver();
                break;
            case "3":
                ClassDriver classDriver = new ClassDriver();
                break;
            default:
                System.out.println("Not recognised");
        }
    }
}
