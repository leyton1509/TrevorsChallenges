package ClassChallenge.Exercise1PersonCreator;

public class PersonDriver {

    public PersonDriver(){
        Person person01 = new Person("James Peterson", 34, 180, 73.15);
        Person person02 = new Person("Bob Thornley", 25, 171, 68.2);

        person01.printPersonDetails();
        person02.printPersonDetails();
    }

}
