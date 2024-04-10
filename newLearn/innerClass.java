package newLearn;

class ab {
    public int id;

    public void show1() {
        System.out.println("This is main class");
    }

    class bd {
        public void show() {
            System.out.println("This is inner class");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        ab objTest = new ab();

        // Creating an instance of the inner class using the outer class instance
        ab.bd y = objTest.new bd();

        // Calling the method of the inner class
        y.show();
    }
}
