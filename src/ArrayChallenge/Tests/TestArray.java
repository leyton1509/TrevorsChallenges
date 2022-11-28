package ArrayChallenge.Tests;

public class TestArray {

    public TestArray(){

        // Sets sum to 0

        int sum = 0;

        // Creates an array of 10 numbers

        int[] numbers = new int[10];

        // Assign each index a value

        numbers[0] = 10;
        numbers[1] = 6;
        numbers[2] = 4;
        numbers[3] = 10;
        numbers[4] = 5;
        numbers[5] = 5;
        numbers[6] = 10;
        numbers[7] = 15;
        numbers[8] = 5;
        numbers[9] = 10;

        // Adds the numbers up

        for (int num: numbers) {
            sum = sum + num;
        }

        // Works out the average by sum / amount of numbers

        double average = sum / numbers.length;

        System.out.println("Sum : " + sum + " Average : " + average);

    }



}
