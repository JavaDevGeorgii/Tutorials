package Eckel.ExampleFabric;

/**
 * Created by GEO on 18.12.15.
 */
public class ImplServFabr2 implements ServiceFabric {
    @Override
    public Service getService() {
        return new ImplService2();
    }
}
