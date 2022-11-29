package MethodsChallenge.Exercise1FibonacciCalc;


import java.math.BigInteger;
import java.util.LinkedList;

public class ExerciseDriver1 {

    /*
    * Fibonacci Generator
     */
    public ExerciseDriver1(){

        // Has to use big integers to represent the end fib numbers

        BigInteger numOne = BigInteger.ZERO;
        BigInteger numTwo = BigInteger.ONE;

        // Uses a list to store the values

        LinkedList<BigInteger> numbers = new LinkedList<>();

        numbers.add(numOne);
        numbers.add(numTwo);

        // Starts at 2 as the first two values are done, all the way to 100

        int maxFabNumber = 100;
        int counter = 2;

        // Adds the two numbers together
        // Sets the new values
        // Increases counter

        while (counter < maxFabNumber){
            BigInteger fibNumber = numOne.add(numTwo);
            numOne = numTwo;
            numTwo = fibNumber;
            numbers.add(fibNumber);
            counter++;
        }

        // Prints the values

        for (BigInteger number:numbers) {
            System.out.println(number);
        }


    }

}
