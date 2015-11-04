package exeptiontutor;

/**
 * Created by GEO on 28.02.15.
 */
public class Main {
    public static void main (String... args){

        try {
            throw new MyExeprion();
        } catch (MyExeprion myExeprion) {
            myExeprion.printStackTrace();
        }

    }
}
