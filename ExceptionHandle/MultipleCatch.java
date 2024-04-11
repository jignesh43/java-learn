package ExceptionHandle;

class MultipleError {
    public void error() {
        int i = 0;
        int[] arr = new int[5];
        try {
            int a = arr[0];
            int b = arr[5];
            int w = 44 / i; // This line will throw an ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This is an out of bounds error");
        } catch (ArithmeticException e) {
            System.out.println("This error is due to division by zero");
        } catch (Exception e) {
            System.out.println("This error is caused by some other problem");
        }
    }
}

public class MultipleCatch {
    public static void main(String[] args) {
        MultipleError ar = new MultipleError();
        ar.error();
    }
}
