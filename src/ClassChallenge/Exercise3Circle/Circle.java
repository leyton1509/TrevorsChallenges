package ClassChallenge.Exercise3Circle;

/**
 * A circle class to represent a circle
 */
public class Circle {

    // Radius of circle
    private double radius = 1;

    // The colour of the circle
    private String color = "red";

    /**
     * Default constructor
     */
    public Circle(){
    }

    /**
     * @param _radius the radius of the circle, default to 1
     */
    public Circle(double _radius){
        radius = _radius;
    }

    /**
     * @return the colour of the circle
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the radius of the circle
     */

    public double getRadius() {
        return radius;
    }

    /**
     * @return the area of the circle
     */

    public double getArea() {
        return (3.14 * (radius * radius));
    }
}
