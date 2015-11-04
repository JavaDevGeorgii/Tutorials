package tutorialOOP1;

/**
 * Created by GEO on 28.02.15.
 */
public class Cat {
    public int age;
    public String name;
    public String kinde;

    @Override
    public String toString() {
        return "Cat == Name: " + name + ", Age: " + age + ", Kinde: " + kinde;
    }
}
