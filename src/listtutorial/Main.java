package listtutorial;
import java.util.*;

/**
 * Created by GEO on 01.03.15.
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        list.add("String 4");
        list.add("String 5");
        list.add("String 6");

        for (String iter : list) {
            System.out.println("args = [" + iter + "]");
        }

        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();


        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            set1.add(iterator.next());

        }
        set2.add(set1.toString());

        System.out.println(set1.contains("String 1"));

        System.out.println(set2.contains("String 2"));
/*
        Iterator<String> iterator1 = set1.iterator();
       // Iterator<String> iterator2 = set2.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1);
        }
       // while (iterator1.hasNext()) {
          //  System.out.println("set2 " + iterator2);
        } */
    }
}
