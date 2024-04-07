class test{
    String name ;
    int id;
    static String company;
    public static void show(test  o){
        System.out.println(o.name + ":"+o.id +":"+company);
    }
}
public class static_method {

    public static void main(String arg[]){
        test a=new test();
        a.id=958;
        a.name="fg";
        test.company="yeah";
        test.show(a);

    }
}
