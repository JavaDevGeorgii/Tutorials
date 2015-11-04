package polymorth;

/**
 * Created by GEO on 05.11.15.
 */
public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Triangle: draw()");
    }

    @Override
    public void print() {
        System.out.println("Triangle: print()");
    }
}
