package thread;
class s1 extends Thread{
    public void run(){
        for(int i =0; i<1000; i++) {
            System.out.println("shree");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
class  s2 extends Thread{
    // show replace by run
    public void run(){
        for(int i =0; i<1000; i++) {
            System.out.println("krishna");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class Sleep {
    // what is thread
    // a thread is a thread of execution in a program java by default provide main thread
    public static void main(String []arg){
        s1 t1= new s1();
        s2 t2 = new s2();

        t1.start();
        t2.start();


    }


}
