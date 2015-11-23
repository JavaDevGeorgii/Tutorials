package Eckel.gamefabric;

/**
 * Created by GEO on 24.11.15.
 */
public class ChessFactory implements GameFabric{

    public Game getGame() {
        return new Chess();
    }
}
