package Eckel.gamefabric;

/**
 * Created by GEO on 24.11.15.
 */
public class Games {
    public static void playGame(GameFabric fabric){
        Game s=fabric.getGame();
        while (s.move());
    }

    public static void main(String []args){
        playGame(new CheckersFabric());
        playGame(new ChessFactory());
    }



}
