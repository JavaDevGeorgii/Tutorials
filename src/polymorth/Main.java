package polymorth;

/**
 * Created by GEO on 05.11.15.
 */
public class Main {
    public static void main(String []arg){
        int count=10;
        Shape[] shapes=new Shape[count];
        FabricGenerator fG=new FabricGenerator();

        for (int i=0;i<count;i++){
            shapes[i]=fG.next();
        }

        for (Shape s:shapes){
            s.draw();
        }
    }
}
