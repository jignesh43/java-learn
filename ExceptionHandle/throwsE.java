package ExceptionHandle;
class e1 {
    public void err1(){
        int i=0;
        int j=44/i;
    }
}
class  e2{
    public void err2() {
        int[] arr = new int[4];
        int w = arr[4];
    }
}

class handle{
    public void err3() throws ArithmeticException,ArrayIndexOutOfBoundsException {


         /*   e1 a = new e1();
            a.err1();*/
            e2 y = new e2();
            y.err2();


    }
}

public class throwsE {
    public static void main(String[] args){
        handle h=new handle();
        h.err3();
    }

}
