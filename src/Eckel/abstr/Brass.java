package Eckel.abstr;

/**
 * Created by GEO on 11.11.15.
 */
public class Brass extends Wind {

    public void play(Note n){
        System.out.println("Brass play() "+n);
    }

    public void adjust(){
        System.out.println("Brass adjast");
    }
}
