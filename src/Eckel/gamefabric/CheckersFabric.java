package Eckel.gamefabric;

/**
 * Created by GEO on 23.11.15.
 */
public class CheckersFabric implements GameFabric {

    public Game getGame() {
        return new Checkers();
    }
}
