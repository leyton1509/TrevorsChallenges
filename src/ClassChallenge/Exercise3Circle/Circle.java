package ClassChallenge.Exercise3Circle;

public class Circle {

    private double radius = 1;
    private String color = "red";

    public Circle(){
    }

    public Circle(double _radius){
        radius = _radius;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (3.14 * (radius * radius));
    }
}
