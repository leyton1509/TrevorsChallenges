package MethodsChallenge;


import MethodsChallenge.Exercise1FibonacciCalc.ExerciseDriver1;
import MethodsChallenge.Exercise2Calculator.ExerciseDriver2;
import MethodsChallenge.Exercise3MinMaxMethods.ExerciseDriver3;

import java.util.Scanner;

public class MethodsDriver {

    /**
     * Methods driver to run the methods exercises
     */
    public MethodsDriver(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter which exercise to run\n| 1 Fibonacci |\n| 2 Calculator |\n| 3 MaxMin |\nChoice:");
        int input = reader.nextInt();

        switch (input){
            case 1:
                ExerciseDriver1 driverOne = new ExerciseDriver1();
                break;
            case 2:
                ExerciseDriver2 driverTwo = new ExerciseDriver2();
                break;
            case 3:
                ExerciseDriver3 driverThree = new ExerciseDriver3();
                break;
            default:
                System.out.println("Wrong number");
        }


    }

}
