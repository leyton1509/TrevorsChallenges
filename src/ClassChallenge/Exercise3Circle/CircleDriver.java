package ClassChallenge.Exercise3Circle;

public class CircleDriver {

    /**
     * Driver to interact with the circle class
     */
    public CircleDriver(){

        // Creates a new circle with both constructors and prints the areas.
        Circle circle = new Circle();
        System.out.println("First circle default constructor area : " + circle.getArea());
        Circle circle2 = new Circle(10);
        System.out.println("First circle default constructor area : " + circle2.getArea());
    }
}
