package abstr;

/**
 * Created by GEO on 11.11.15.
 */
public abstract class Instrument {

    private int i;
    public abstract void play(Note n);
    public String what(){
        return "Instrument";
    }
    public abstract void adjust();

}
