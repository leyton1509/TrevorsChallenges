package MethodsChallenge;


import MethodsChallenge.Exercise1.ExerciseDriver1;
import MethodsChallenge.Exercise2.ExerciseDriver2;
import MethodsChallenge.Exercise3.ExerciseDriver3;

import java.util.Scanner;

public class MethodsDriver {


    ExerciseDriver1 driverOne = new ExerciseDriver1();
    ExerciseDriver2 driverTwo = new ExerciseDriver2();
    ExerciseDriver3 driverThree = new ExerciseDriver3();

    public MethodsDriver(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter which exercise to run | 1 | 2 | 3 |:");
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
            default:
                System.out.println("Wrong number");
        }


    }

}
