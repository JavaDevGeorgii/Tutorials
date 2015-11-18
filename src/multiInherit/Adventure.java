package multiInherit;

/**
 * Created by GEO on 18.11.15.
 */
public class Adventure   {

    public static void t(CanFight x){
        x.fight();
    }
    public static void u(CanSwim x){
        x.swim();
    }
    public static void v(CanFly x){
        x.fly();
    }
    private static void w(AutoCharacter x){
        x.fight();
    }

    public static void main(String []args){

        Hero h=new Hero();

        t(h);
        u(h);
        v(h);
        w(h);
    }
}
