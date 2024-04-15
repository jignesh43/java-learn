package CollectionType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listtest {
    public static void main(String [] arg){
        System.out.println("learn about list");
        List<Integer>a=new ArrayList<Integer>();
        a.add(5);
        a.add(5);
        a.add(4);
        a.add(33);
        Iterator<Integer> values =a.iterator();
        while (values.hasNext()){
            System.out.println(values.next());
        }
      /*  for (int y :a){
            System.out.println(y);
        }
        System.out.println(a);*/
        // in list is also take repeated value and print all value using print function

    }
}
