package ArrayChallenge;


import ArrayChallenge.Tests.Duplicates;
import ArrayChallenge.Tests.ExistInArray;
import ArrayChallenge.Tests.MaxAndMin;
import ArrayChallenge.Tests.TestArray;

import java.util.Scanner;

public class ArrayDriver {

    public ArrayDriver() {

        // Creates a scanner to ask for option

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.print("\nMain Menu\n" +
                "1. Test 1 Test Array\n" +
                "2. Test 2 ExistInArray\n" +
                "3. Test 3 MaxAndMin\n" +
                "4. Test 4 Duplicates\nEnter test number:");

        // Gets the users input

        String menuInput = myObj.nextLine().toLowerCase();  // Read user input

        // Runs the neccasary test

        switch(menuInput){
            case "1":
                TestArray testArray = new TestArray();
                break;
            case "2":
                ExistInArray existInArray = new ExistInArray();
                break;
            case "3":
                MaxAndMin maxAndMin = new MaxAndMin();
                break;
            case "4":
                Duplicates duplicates = new Duplicates();
                break;
            default:
                System.out.println("Not recognised");
        }
    }


}
