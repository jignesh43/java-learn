package opps;
class test {
    public int id;

    //method
    public void show() {
        System.out.println("this is method ");
    }

    public void most(int a, int b) {
        System.out.println("both method is identical for overloading, perameter is diff");
        System.out.println("first method");
    }

    public void most(int a) {
        System.out.println("both method is identical for overloading, perameter is diff");
        System.out.println("second method");

    }
}
public class Method_and_overloading {
    public static void main(String[] arg) {
        int r = 4;
        int b = 8;

        // creating object
        test a = new test();
        // calling method
        a.show();
        a.most(r);
        a.most(r, b);
    }
}