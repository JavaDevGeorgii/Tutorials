package Eckel.gamefabric;

/**
 * Created by GEO on 23.11.15.
 */
public class Checkers implements Game{

    private int moves=0;
    private static final int MOVES=3;

    public boolean move() {
        System.out.println("Checkers move "+ moves);
        return ++moves != MOVES;
    }
}
