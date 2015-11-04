package polymorthInheritConstruct;

/**
 * Created by GEO on 05.11.15.
 */
public class Sandwitch extends PortableLunch{

    private Bread bread=new Bread();
    private Cheese cheese=new Cheese();
    private Letuce letuce=new Letuce();
    public Sandwitch(){
        System.out.println("Contructor: Sandwitch()");
    }
    public static void main(String[] arg){

        new Sandwitch();
    }
}
