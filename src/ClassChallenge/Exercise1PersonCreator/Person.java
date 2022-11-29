package ClassChallenge.Exercise1PersonCreator;

public class Person {

    // The name of the Person
    private String name;

    // The age of the Person
    private int age;

    // The height of the Person
    private double height;

    // The weight of the Person
    private double weight;

    /**
     * @return The age of the person
     */
    public int getAge() {
        return age;
    }

    /**
     * @return The height of the person
     */

    public double getHeight() {
        return height;
    }

    /**
     * @return The weight of the person
     */

    public double getWeight() {
        return weight;
    }

    /**
     * @return The name of the person
     */

    public String getName() {
        return name;
    }

    /**
     * @param name the name to set the new name to
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param age the age to set the new name to
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param weight the weight to set the new name to
     */

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @param height the height to set the new name to
     */

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Default constructor
     * @param _name the name of the Person
     * @param _age the age of the person
     * @param _height the height of the person
     * @param _weight the weight of the person
     */
    public Person(String _name, int _age, double _height, double _weight){
        setName(_name);
        setAge(_age);
        setHeight(_height);
        setWeight(_weight);
    }

    /**
     * Prints the details of the person
     */
    public void printPersonDetails(){
        System.out.println("Name : " + getName() + " Age : " + getAge() + " Height : " + getHeight() + " Weight : " + getWeight());
    }

    /**
     * Updates the age, height and weight of a person
     */

    public void growOlder(){
        setAge((getAge() +1));
        setHeight((getHeight() -1));
        setWeight((getWeight() -0.5));
    }

}
