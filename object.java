
 class Students
{    public int id;
    public String name;


        }


public class object {
    public static void main(String [ ] arg){

        Students stu =new Students();
        stu.id=12;
        stu.name="jignesh";

        Students stu1 =new Students();
        stu1.id=1542;
        stu1.name="jkd";

        Students stu2 =new Students();
        stu2.id=124;
        stu2.name="rshul";

        Students arrobj[] =  new Students[3];
        arrobj[0]=stu1;
        arrobj[1]=stu;
        arrobj[2]=stu2;
        for (Students s:arrobj) {
            System.out.println(s.name);
        }


    }
}
