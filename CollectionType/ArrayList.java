package CollectionType;

import java.util.Collection;

public class ArrayList {

    public static void main(String []arg){

        Collection<Integer> test= new java.util.ArrayList<Integer>();
        test.add(5);
        test.add(4);
        test.add(4);
        for (int a :test){
            System.out.println(a);
        }
        //index is not here
        //System.out.println(test);
        //here we can see repeat value take place and direct print by the help of sout



    }
}
