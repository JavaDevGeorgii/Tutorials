package tutorialOOP1;

/**
 * Created by GEO on 28.02.15.
 */
public class People {
    public int age;
    public  String firstName;
    public String lastName;
    Cat cat;

    @Override
    public String toString() {
        return "People == Name: " + firstName + ", LastName: " + lastName + ", Age: " + age+ "   " + cat + " ";
    }
}
