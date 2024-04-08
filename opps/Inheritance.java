package opps;
// parent child concept
class Parents{
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class Child extends Parents {
    private  String childname;

    public String getChildname() {
        return childname;
    }


    public void setChildname(String childname) {
        this.childname = childname;
    }

}
public class Inheritance {
    public static void main(String [] arg){

        Child a= new Child();
        a.setChildname("tony");
        a.setId(15);
        a.setName("rahul");
        System.out.println(a.getName());
        System.out.println(a.getId());
        System.out.println(a.getChildname());

    }
}
