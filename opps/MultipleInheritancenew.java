package opps;
interface car{
    public void te();
}
interface bus{
    public void b();

}
class vichal implements car,bus {
    @Override
    public void b() {
        System.out.println("this is interface class");

    }

    @Override
    public void te() {
        System.out.println("this is also interface class and this override by class vichal");

    }
    public void self(){
        System.out.println("this is self class vichal");
    }
}
public class MultipleInheritancenew {
    public static void main(String []arg){

        vichal v =new vichal();
        v.b();
        v.te();
        v.self();

    }
}
