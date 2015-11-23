package Eckel.horrorshow;

/**
 * Created by GEO on 22.11.15.
 */
public class HorrorShow {

    static void u(Monster b){
        b.manace();
    }

    static void v(DangerousMonster d){
        d.destroy();
        d.manace();
    }

    static void w(Lethal l){
        l.kill();
    }

    static void main(String []arg){

        DangerousMonster barney=new DragonZilla();
        u(barney);
        v(barney);

        Vampire vlad=new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
