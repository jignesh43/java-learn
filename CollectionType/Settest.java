package CollectionType;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Settest {
    public static void main(String [] arg){
        System.out.println("learn about set ");
        //this is a syntax of set
       // Set<Integer>s= new HashSet<>();
        //for short
        Set<Integer>s= new TreeSet<>();

        s.add(4);
        s.add(4);
        s.add(5);
        s.add(8);
        for (int a :s){
            System.out.println();
        }
        //System.out.println(s);
        // here we can see that set is content diffrent value

    }
}
