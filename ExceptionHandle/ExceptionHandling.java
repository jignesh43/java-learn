package ExceptionHandle;

class AdvCal {
    int j;

    public AdvCal() {
        try {
            int i = 0;
            j = 54 / i;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error occurred.");
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        AdvCal a = new AdvCal();
        System.out.println(a.j);
    }
}
