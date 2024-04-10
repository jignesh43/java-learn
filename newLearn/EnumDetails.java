package newLearn;
@FunctionalInterface
interface status1{
  public void show();
}
/*class  a implements status1{
    @Override
    public void show() {


    }*/

public class EnumDetails {
    public static void main(String [] arg){
        // in which use lamda expression

        status1 a=() -> System.out.println("it is only use in functionalinterface that mean only one method is present");
         a.show();
        }
    }

