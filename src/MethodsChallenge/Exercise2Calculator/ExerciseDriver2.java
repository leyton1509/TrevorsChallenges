package MethodsChallenge.Exercise2Calculator;

import java.util.Scanner;

public class ExerciseDriver2 {

    /**
     * Driver for exercise 2
     */
    public ExerciseDriver2(){

        // Gets two inputs from the user

        System.out.println("Calculator App - Enter two numbers:");
        Scanner reader = new Scanner(System.in);
        System.out.print("Number one :");
        int inputOne = reader.nextInt();
        System.out.print("Number two :");
        int inputTwo = reader.nextInt();

        // Creates a calculator class

        Calculator calc = new Calculator();

        // Prints the operations

        System.out.println("Adding : " + calc.add(inputOne, inputTwo));
        System.out.println("Adding : " + calc.subtract(inputOne, inputTwo));
        System.out.println("Adding : " + calc.multiply(inputOne, inputTwo));
        System.out.println("Adding : " + calc.divide(inputOne, inputTwo));



    }


}
