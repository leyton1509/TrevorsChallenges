package MethodsChallenge.Exercise2Calculator;

/**
 * Calculator class to perform basic instructions
 */
public class Calculator {

    /**
     * @param numOne the first number to perform the operation on
     * @param numTwo the second number to perform the operation on
     * @return the two numbers with the add operation performed between them
     */
    public int add(int numOne, int numTwo){
        return numOne + numTwo;
    }

    /**
     * @param numOne the first number to perform the operation on
     * @param numTwo the second number to perform the operation on
     * @return the two numbers with the minus operation performed between them
     */

    public int subtract(int numOne, int numTwo){
        return numOne - numTwo;
    }

    /**
     * @param numOne the first number to perform the operation on
     * @param numTwo the second number to perform the operation on
     * @return the two numbers with the times operation performed between them
     */

    public int multiply(int numOne, int numTwo){
        return numOne * numTwo;
    }

    /**
     * @param numOne the first number to perform the operation on
     * @param numTwo the second number to perform the operation on
     * @return the two numbers with the divide operation performed between them
     */

    public int divide(int numOne, int numTwo){
        return Math.round(numOne / numTwo);
    }

}
