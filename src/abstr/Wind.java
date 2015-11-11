package abstr;

/**
 * Created by GEO on 11.11.15.
 */
public class Wind extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Wind play() "+n);
    }

    public String what(){
        return "Wind";
    }
    @Override
    public void adjust() {


    }
}
