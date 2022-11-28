package ArrayChallenge.Tests;

import java.util.Scanner;

public class ExistInArray {

    public ExistInArray(){

        // Creates an array and asks for the users input

        int[] numbers = {1,5,7,8,4,23,454,23};
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("\nEnter an integer :");
        int inputNum = myObj.nextInt();  // Read user input

        // Creates a boolean found that is updated to true if the number is found in the array

        boolean found = false;

        for (int num : numbers) {
            if(num == inputNum){
                found = true;
            }
        }

        // Prints the relevant output message

        if(found){
            System.out.println("Value " + inputNum + " exists in array");
        }
        else {
            System.out.println("Value was not found in array");
        }

    }


}
