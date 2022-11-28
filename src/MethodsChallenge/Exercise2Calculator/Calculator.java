package MethodsChallenge.Exercise2Calculator;

public class Calculator {

    public int add(int numOne, int numTwo){
        return numOne + numTwo;
    }

    public int subtract(int numOne, int numTwo){
        return numOne - numTwo;
    }

    public int multiply(int numOne, int numTwo){
        return numOne * numTwo;
    }

    public int divide(int numOne, int numTwo){
        return Math.round(numOne / numTwo);
    }

}
