package MethodsChallenge.Exercise3MinMaxMethods;


import java.util.Scanner;

public class ExerciseDriver3 {

    /**
     * Driver for the min max app
     */
    public ExerciseDriver3(){

        // Asks the user to input 3 strings
        System.out.println("MinMaxApp App - Enter three numbers:");
        Scanner reader = new Scanner(System.in);

        System.out.print("Number one :");
        String inputOne = reader.nextLine();

        System.out.print("Number two :");
        String inputTwo = reader.nextLine();

        System.out.print("Number three :");
        String inputThree = reader.nextLine();

        // Creates the min maxer

        MinMaxer mixer = new MinMaxer();


        // If all the numbers are integers, then parse them as integers and call the integer method

        if((Double.parseDouble(inputOne) % 1 == 0) && (Double.parseDouble(inputTwo) % 1 == 0) && (Double.parseDouble(inputThree) % 1 == 0)){
            System.out.println("Minimum int : " + mixer.minimumCalc(Integer.parseInt(inputOne), Integer.parseInt(inputTwo), Integer.parseInt(inputThree)));
            System.out.println("Maximum int : " + mixer.maximumCalc(Integer.parseInt(inputOne), Integer.parseInt(inputTwo), Integer.parseInt(inputThree)));
        }
        // Otherwise call the double method
        else{
            System.out.println("Minimum double : " + mixer.minimumCalc(Double.parseDouble(inputOne), Double.parseDouble(inputTwo), Double.parseDouble(inputThree)));
            System.out.println("Maximum double : " + mixer.maximumCalc(Double.parseDouble(inputOne), Double.parseDouble(inputTwo), Double.parseDouble(inputThree)));
        }


    }


}
