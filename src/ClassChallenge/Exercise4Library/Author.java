package ClassChallenge.Exercise4Library;

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String _name, String _email, char _gender){
        name = _name;
        email = _email;
        gender = _gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String toString(){
        return "Name = " + name + " , Email = " + email + " , Gender = " + gender;
    }
}
