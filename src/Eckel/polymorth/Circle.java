package Eckel.polymorth;

/**
 * Created by GEO on 04.11.15.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle: draw()");
    }

    @Override
    public void print() {
        System.out.println("Circle: print()");
    }
}
