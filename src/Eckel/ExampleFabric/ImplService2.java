package Eckel.ExampleFabric;

/**
 * Created by GEO on 18.12.15.
 */
public class ImplService2 implements Service {
    public ImplService2() {
        System.out.println("Constructor ImplService2");
    }

    @Override
    public void method1() {
        System.out.println("Method1 of ImplService2 class");
    }

    @Override
    public void method2() {

        System.out.println("Method2 of ImplService2 class");
    }
}
