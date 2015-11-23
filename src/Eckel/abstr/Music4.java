package Eckel.abstr;

/**
 * Created by GEO on 12.11.15.
 */
public class Music4 {
    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] instruments){
        for (Instrument i: instruments){
            tune(i);
        }
    }

    public static void main(String [] arg){
        Instrument[] orchestra={
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }

}
