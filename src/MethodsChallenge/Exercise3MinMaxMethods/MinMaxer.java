package MethodsChallenge.Exercise3MinMaxMethods;

/**
 * Code for the min and max calculations
 */
public class MinMaxer {

    /**
     * @param one the first int
     * @param two the second int
     * @param three the third int
     * @return the smallest value
     */
    public int minimumCalc(int one, int two, int three){
        int minOne = Math.min(one, two);
        return Math.min(minOne, three);
    }

    /**
     * @param one the first int
     * @param two the second int
     * @param three the third int
     * @return the largest value
     */

    public int maximumCalc(int one, int two, int three){
        int minOne = Math.max(one, two);
        return Math.max(minOne, three);
    }

    /**
     * @param one the first double
     * @param two the second double
     * @param three the third double
     * @return the smallest value
     */

    public double minimumCalc(double one, double two, double three){
        double minOne = Math.min(one, two);
        return Math.min(minOne, three);
    }

    /**
     * @param one the first double
     * @param two the second double
     * @param three the third double
     * @return the largest value
     */

    public double maximumCalc(double one, double two, double three){
        double minOne = Math.max(one, two);
        return Math.max(minOne, three);
    }
    

}
