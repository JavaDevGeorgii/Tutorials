package initInherit;

/**
 * Created by GEO on 05.11.15.
 */
public class Beets extends Insect {
    private int k=printInit("Filds Beets - was initial! ");

    public Beets() {
        System.out.println("k= "+k);
        System.out.println("j= "+j);
    }
    public static int x2=printInit("Field static Beets x2 - was initial");

    public static void main(String[] arg){
        System.out.println("Contructor Beets! ");
        Beets b=new Beets();
    }
}
