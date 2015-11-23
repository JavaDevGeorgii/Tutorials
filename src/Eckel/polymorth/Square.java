package Eckel.polymorth;

/**
 * Created by GEO on 05.11.15.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square: draw()");
    }

    @Override
    public void print() {
        System.out.println("Square: print()");
    }
}
