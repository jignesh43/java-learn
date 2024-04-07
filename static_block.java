class Test {
    String name;
    int id;
    static String company;
    static {
        System.out.println("hello first i am called ");
    }
    public Test(){
        System.out.println("i m constructor");

    }
}

public class static_block {
    public static void main(String[] arr) {
        Test d = new Test();

    }
}
