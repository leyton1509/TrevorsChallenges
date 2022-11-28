package MethodsChallenge.Exercise3MinMaxMethods;


import java.util.Scanner;

public class ExerciseDriver3 {

    public ExerciseDriver3(){
        System.out.println("MinMaxApp App - Enter three numbers:");
        Scanner reader = new Scanner(System.in);

        System.out.print("Number one :");
        String inputOne = reader.nextLine();

        System.out.print("Number two :");
        String inputTwo = reader.nextLine();

        System.out.print("Number three :");
        String inputThree = reader.nextLine();

        MinMaxer mixer = new MinMaxer();

        if((Double.parseDouble(inputOne) % 1 == 0) && (Double.parseDouble(inputTwo) % 1 == 0) && (Double.parseDouble(inputThree) % 1 == 0)){
            System.out.println("Minimum int : " + mixer.minimumCalc(Integer.parseInt(inputOne), Integer.parseInt(inputTwo), Integer.parseInt(inputThree)));
            System.out.println("Maximum int : " + mixer.maximumCalc(Integer.parseInt(inputOne), Integer.parseInt(inputTwo), Integer.parseInt(inputThree)));
        }
        else{
            System.out.println("Minimum double : " + mixer.minimumCalc(Double.parseDouble(inputOne), Double.parseDouble(inputTwo), Double.parseDouble(inputThree)));
            System.out.println("Maximum double : " + mixer.maximumCalc(Double.parseDouble(inputOne), Double.parseDouble(inputTwo), Double.parseDouble(inputThree)));
        }


    }


}
