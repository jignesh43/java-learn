package ExceptionHandle;
class arrayError {
    public void array() {
        int[] arr = new int[5];
        try {
            int a = arr[0];
            int b = arr[5];
        } catch (Exception e) {
            System.out.println("this is out of bond error");
        }
    }
}

    public class arrayErrorfound {
        public static void main(String[] args) {
         arrayError ar = new arrayError();
         ar.array();

        }
    }


