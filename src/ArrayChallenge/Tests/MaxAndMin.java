package ArrayChallenge.Tests;
import java.util.Random;

public class MaxAndMin {

    public MaxAndMin(){

        // Creates an array and populates them with 10 numbers between 1 and 100

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100)+1;
        }

        // Sets to varibales max and min to the first value in the array

        int minimumValue = numbers[0];
        int maximumValue = numbers[0];

        System.out.println("Array :");

        // Loops through the numbers and
        // updates min if the num is less than the current minimum
        // updates max if the num is greater than the current maximum

        for (int num:numbers) {

            if(num < minimumValue){
                minimumValue = num;
            }
            if(num > maximumValue){
                maximumValue = num;
            }
            System.out.print(" " + num);
        }

        // Prints out max and min

        System.out.println("\nMax Value : " + maximumValue + " Min Value : " + minimumValue);

    }


}
