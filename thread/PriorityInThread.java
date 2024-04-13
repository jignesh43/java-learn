package thread;
class th3 extends Thread{
    public void run(){
        for(int i =0; i<1000; i++) {
            System.out.println("shree");
        }

    }

}
class  th4 extends Thread{
    // show replace by run
    public void run(){
        for(int i =0; i<1000; i++) {
            System.out.println("krishna");
        }

    }
}
public class PriorityInThread {
    // what is thread
    // a thread is a thread of execution in a program java by default provide main thread
    public static void main(String []arg){
        th3 t1= new th3();
        th4 t2 = new th4();
t2.getPriority();
t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();


    }


}
