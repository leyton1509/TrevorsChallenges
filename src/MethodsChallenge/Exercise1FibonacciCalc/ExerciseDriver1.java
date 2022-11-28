package MethodsChallenge.Exercise1FibonacciCalc;


import java.math.BigInteger;
import java.util.LinkedList;

public class ExerciseDriver1 {
    public ExerciseDriver1(){

        BigInteger numOne = BigInteger.ZERO;
        BigInteger numTwo = BigInteger.ONE;

        LinkedList<BigInteger> numbers = new LinkedList<>();

        numbers.add(numOne);
        numbers.add(numTwo);

        int maxFabNumber = 100;
        int counter = 2;

        while (counter < maxFabNumber){
            BigInteger fibNumber = numOne.add(numTwo);
            numOne = numTwo;
            numTwo = fibNumber;
            numbers.add(fibNumber);
            counter++;
        }

        for (BigInteger number:numbers) {
            System.out.println(number);
        }


    }

}
