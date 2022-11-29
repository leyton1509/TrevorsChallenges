package ClassChallenge.Exercise3Circle;

public class CircleDriver {
    public CircleDriver(){
        Circle circle = new Circle();
        System.out.println("First circle default constructor area : " + circle.getArea());
        Circle circle2 = new Circle(10);
        System.out.println("First circle default constructor area : " + circle2.getArea());
    }
}
