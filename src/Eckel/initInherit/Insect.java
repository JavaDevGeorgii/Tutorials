package Eckel.initInherit;

/**
 * Created by GEO on 05.11.15.
 */
public class Insect {
    private int i=9;
    protected int j;

    public Insect() {
        System.out.println("i= "+i+"  , j= "+j);
        j=37;
    }
    private static int x1=printInit("Feild static Insect x1 - was initial! ");

    static int printInit(String s){
        System.out.println(s);
        return 11;
    }
}
