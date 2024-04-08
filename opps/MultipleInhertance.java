package opps;
class a{
    public void show(){
        System.out.println("hello this is class a and this is granfather class");
    }
}
class c extends b{
    public void show2(){
        System.out.println("this is class c and this is clild");
    }
}
class b extends a{
    public void show1(){
        System.out.println("hello this is class b and this is father class");

    }
}

public class MultipleInhertance {
    public static void main(String [] arg){

        System.out.println(" it is consept of mutilevel inheritance");
        c object = new c();
        object.show();
 object.show1();
 object.show2();
    }

}
