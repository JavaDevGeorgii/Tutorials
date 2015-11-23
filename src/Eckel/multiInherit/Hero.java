package Eckel.multiInherit;

/**
 * Created by GEO on 18.11.15.
 */
public class Hero extends AutoCharacter implements CanFight, CanFly, CanSwim {

    @Override
    public void fly() {
        System.out.println("Hero.fly()");

    }

    @Override
    public void swim() {
        System.out.println("Hero.swim()");
    }
}
