package polymorth;

import java.util.Random;

/**
 * Created by GEO on 05.11.15.
 */
public class FabricGenerator {
    private Random random = new Random(37);

    public Shape next() {
        switch (random.nextInt(3)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            default:
                return null;
        }
    }
}
