package ClassChallenge.Exercise1PersonCreator;

public class PersonDriver {

    /**
     * Person driver to instantiate new people
     */
    public PersonDriver(){

        // Creates two people, with their parameters

        Person person01 = new Person("James Peterson", 34, 180, 73.5);
        Person person02 = new Person("Bob Thornley", 25, 171, 68.2);

        // Calls the grow older method and prints their details

        person01.growOlder();

        person01.printPersonDetails();
        person02.printPersonDetails();
    }

}
