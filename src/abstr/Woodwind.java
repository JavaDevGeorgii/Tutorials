package abstr;

/**
 * Created by GEO on 11.11.15.
 */
public class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Woodwind play() "+n);;
    }

    @Override
    public String what() {
        return "Woodwind";
    }

}
