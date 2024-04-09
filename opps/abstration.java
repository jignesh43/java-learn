package opps;
abstract class Student
        {
            public void show(){
                System.out.println("this is abstract");
            }
            abstract int shape(int a, int b);

        }
        class tests extends Student{
            @Override
            int shape(int a, int b) {
                return a*b;
            }
        }
public class abstration {
    public static void main(String [] arg){

        tests ar = new tests();
        int result = ar.shape(5, 4); // Storing the result
        System.out.println("Result: " + result); // Printing the result
    }

}
