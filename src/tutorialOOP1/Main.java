package tutorialOOP1;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAP12Binding;

/**
 * Created by GEO on 28.02.15.
 */
public class Main {

    public static void main(String[] arg){
        Cat cat=new Cat();
        cat.name="Liza";
        cat.kinde="Siam";
        cat.age=7;
        //System.out.print(cat);

        People man=new People();
        man.firstName="Degtyar";
        man.lastName="Georgy";
        man.age=39;
        man.cat=cat;

        System.out.println(man);
    }
}
