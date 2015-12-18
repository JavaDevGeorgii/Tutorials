package Eckel.ExampleFabric;

/**
 * Created by GEO on 18.12.15.
 */
public class Main {
    public static void doing(ServiceFabric sf){
        Service s=sf.getService();
        s.method1();
        s.method2();
    }

    public static void main(String []arg ){
        doing(new ImplServFabr1());
        doing(new ImplServFabr2());
    }
}
