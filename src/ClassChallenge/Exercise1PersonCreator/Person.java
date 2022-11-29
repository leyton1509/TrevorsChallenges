package ClassChallenge.Exercise1PersonCreator;

public class Person {

    private String name;
    private int age;
    private double height;
    private double weight;

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Person(String _name, int _age, double _height, double _weight){
        setName(_name);
        setAge(_age);
        setHeight(_height);
        setWeight(_weight);
    }

    public void printPersonDetails(){
        System.out.println("Name : " + getName() + " Age : " + getAge() + " Height : " + getHeight() + " Weight : " + getWeight());
    }

    public void growOlder(){
        setAge((getAge() +1));
        setHeight((getHeight() -1));
        setWeight((getWeight() -0.5));
    }

}
