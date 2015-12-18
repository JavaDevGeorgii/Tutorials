package Eckel.ExampleFabric;

/**
 * Created by GEO on 18.12.15.
 */
public class ImplServFabr1 implements ServiceFabric {
    @Override
    public Service getService() {
        return new ImplService1();
    }
}
