package MethodsChallenge.Exercise2Calculator;

import java.util.Scanner;

public class ExerciseDriver2 {

    public ExerciseDriver2(){

        System.out.println("Calculator App - Enter two numbers:");
        Scanner reader = new Scanner(System.in);
        System.out.print("Number one :");
        int inputOne = reader.nextInt();
        System.out.print("Number two :");
        int inputTwo = reader.nextInt();

        Calculator calc = new Calculator();

        System.out.println("Adding : " + calc.add(inputOne, inputTwo));
        System.out.println("Adding : " + calc.subtract(inputOne, inputTwo));
        System.out.println("Adding : " + calc.multiply(inputOne, inputTwo));
        System.out.println("Adding : " + calc.divide(inputOne, inputTwo));



    }


}
