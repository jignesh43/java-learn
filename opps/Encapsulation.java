package opps;

 class students{
    // access modifier
    //private public protected default

   private int id ;
    private String name;
    /* students(int id,String name){
        this.id=id;
        this.name=name;

    }*/

    public void show(){
        System.out.println("id"+id);
    }
    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}

public class Encapsulation {
    public static void main(String [] arg){

       /* System.out.println("this variable directly can not be access");
        student stu = new student();
        stu.id=10;
        System.out.println(stu.id);
        stu.show();*/


        students stu = new students();
        stu.setName("rahul");
        System.out.println(stu.getName());
    }
}
