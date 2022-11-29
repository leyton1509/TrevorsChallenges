package ClassChallenge;

import ClassChallenge.Exercise1PersonCreator.PersonDriver;
import ClassChallenge.Exercise3Circle.CircleDriver;
import ClassChallenge.Exercise4Library.LibraryDriver;

import java.util.Scanner;

public class ClassDriver {

    public ClassDriver() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter which exercise to run\n| 1/2 Person Creator |\n| 3 Circle Class |\n| 4 Library |\nChoice:");
        int input = reader.nextInt();

        switch (input) {
            case 1:
            case 2:
                PersonDriver pDriver = new PersonDriver();
                break;
            case 3:
                CircleDriver cDriver = new CircleDriver();
                break;
            case 4:
                LibraryDriver lDriver = new LibraryDriver();
            default:
                System.out.println("Wrong number");
        }
    }


}
