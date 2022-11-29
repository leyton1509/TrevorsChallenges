package ClassChallenge.Exercise4Library;

/**
 *  A class to represent an Author
 */
public class Author {

    /**
     * The name of the author
     */
    private String name;

    /**
     * The email of the author
     */
    private String email;

    /**
     * The gender of the author
     */
    private char gender;

    /**
     * Default Constructor
     * @param _name The name of the author
     * @param _email The email of author
     * @param _gender The Gender of Author
     */
    public Author(String _name, String _email, char _gender){
        name = _name;
        email = _email;
        gender = _gender;
    }

    /**
     * @return The name of the author
     */
    public String getName() {
        return name;
    }

    /**
     * @return The email of the author
     */

    public String getEmail() {
        return email;
    }

    /**
     * @return The gender of the author
     */

    public char getGender() {
        return gender;
    }

    /**
     * @return string of the author
     */

    public String toString(){
        return "Name = " + name + " , Email = " + email + " , Gender = " + gender;
    }
}
