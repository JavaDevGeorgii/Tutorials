package abstr;

/**
 * Created by GEO on 11.11.15.
 */
public class Percussion extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Percussion play() "+ n);
    }

    public String what(){
        return "Percussion";
    }
    @Override
    public void adjust() {

    }
}
