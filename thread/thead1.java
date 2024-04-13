package thread;
class th1 extends Thread{
    public void run(){
        for(int i =0; i<1000; i++) {
            System.out.println("shree");
        }

    }

}
class  th2 extends Thread{
    // show replace by run
    public void run(){
        for(int i =0; i<1000; i++) {
            System.out.println("krishna");
        }

    }
}
public class thead1 {
    // what is thread
  // a thread is a thread of execution in a program java by default provide main thread
    public static void main(String []arg){
        th1 t1= new th1();
        th2 t2 = new th2();

        t1.start();
        t2.start();


    }


}
