package Eckel.gamefabric;

/**
 * Created by GEO on 23.11.15.
 */
public class Chess implements Game {

    private int moves=0;
    private static final int MOVES=4;

    public boolean move() {
        System.out.println("Chess moves "+ moves);
        return ++moves != MOVES;
    }
}
