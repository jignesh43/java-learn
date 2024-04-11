package ExceptionHandle;
class MultipleError1 {
    public void error() {
        int i = 0;
        int[] arr = new int[5];
        if (i == 0) {
            throw new ArithmeticException("Division by zero error");
        }
        try {

            int a = arr[0];
            int b = arr[5]; // This line will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This is an out of bounds error");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("This error is caused by some other problem");
        }
    }
}
public class Throw {
    public static void main(String[] args) {
        MultipleError1 ar = new MultipleError1();
        ar.error();
    }
}
