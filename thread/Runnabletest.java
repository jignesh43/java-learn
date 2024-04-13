package thread;
class class1 implements Runnable{
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
class  class2 implements Runnable{
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
public class Runnabletest {
    // what is thread
    // a thread is a thread of execution in a program java by default provide main thread
    public static void main(String []arg){
        class1 t1= new class1();
        class2 t2 = new class2();
   Thread p=new Thread(t1);
        Thread p1=new Thread(t2);
        p.start();
        p1.start();


    }


}
