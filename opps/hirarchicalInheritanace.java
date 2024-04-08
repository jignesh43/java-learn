package opps;
class father {
    public void fa(){
        System.out.println("this is father class ");

    }

}
class childA extends father{
    public void ca(){
        System.out.println("this is clild a class");
    }
}
class childB extends father{

    public void cb(){
        System.out.println("this is a child b class ");

    }

}

public class hirarchicalInheritanace  {
 public static void main(String [] arg){

    childA a= new childA();
    childB  b= new childB();

     a.ca();
     a.fa();
     b.cb();
     b.fa();

 }

}

