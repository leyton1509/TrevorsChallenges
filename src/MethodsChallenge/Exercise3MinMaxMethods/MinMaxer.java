package MethodsChallenge.Exercise3MinMaxMethods;

public class MinMaxer {

    public int minimumCalc(int one, int two, int three){
        int minOne = Math.min(one, two);
        return Math.min(minOne, three);
    }

    public int maximumCalc(int one, int two, int three){
        int minOne = Math.max(one, two);
        return Math.max(minOne, three);
    }

    public double minimumCalc(double one, double two, double three){
        double minOne = Math.min(one, two);
        return Math.min(minOne, three);
    }

    public double maximumCalc(double one, double two, double three){
        double minOne = Math.max(one, two);
        return Math.max(minOne, three);
    }
    

}
