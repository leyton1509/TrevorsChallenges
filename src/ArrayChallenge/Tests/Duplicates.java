package ArrayChallenge.Tests;

import java.util.Random;

public class Duplicates {

    public Duplicates(){

        // Creates two arrays and populates them with random numbers from 1 to 20
        // 2 for loops are used to print the arrays in the correct way

        Random rand = new Random();

        int[] numbersOne = new int[10];
        int[] numbersTwo = new int[10];

        System.out.println("Array One : ");

        for (int i = 0; i < numbersOne.length; i++) {
            numbersOne[i] = rand.nextInt(20)+1;
            System.out.print(" " + numbersOne[i]);
        }

        System.out.println("\nArray Two : ");

        for (int i = 0; i < numbersTwo.length; i++) {
            numbersTwo[i] = rand.nextInt(20)+1;
            System.out.print(" " + numbersTwo[i]);
        }

        System.out.println("\nDuplicates : ");

        // Sees if the value at index i is a duplicate by comparing it to the values within the other array

        for (int i = 0; i < numbersOne.length; i++) {
            for (int j = 0; j < numbersTwo.length; j++) {
                if(numbersOne[i] == numbersTwo[j]){
                    System.out.print(" " + numbersOne[i]);
                }
            }
        }



    }


}
