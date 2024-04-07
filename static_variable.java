
class car{
    String name ;
    int id;
   static String company;
    public void show(){
        System.out.println(name + ":"+id +":"+company);
    }
}

public class static_variable {
    public static void main(String [] arg)
    {
        car a = new car();
        a.id=958;
        a.name="fg";
        car.company="joshi";
        car b = new car();
        b.id=98;
        b.name="maruti";
        car.company="joshi";
        a.show();
        b.show();

    }
}
