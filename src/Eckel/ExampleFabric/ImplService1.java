package Eckel.ExampleFabric;

/**
 * Created by GEO on 18.12.15.
 */
public class ImplService1 implements Service {
    public ImplService1() {
        System.out.println("Constructor ImplService1");
    }

    @Override
    public void method1() {
        System.out.println("Method1 of ImplService1 class");
    }

    @Override
    public void method2() {
        System.out.println("Method2 of ImplService1 class");
    }
}
