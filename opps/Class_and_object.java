package opps;
//this is class it is blue print
class student{
    public int id;
    public String name ;
    public String address;

}
public class Class_and_object {
    public static void main (String [] arg){
   //creating object using new keyword
        student object = new student();
        object.id=45;
        object.name="rahul";
        object.address="mumbai";
        System.out.println(object.id);
        System.out.println(object.address);
        System.out.println(object.name);
    }
}
