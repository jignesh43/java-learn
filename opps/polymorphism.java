package opps;
//banking system
class bank{
    public void rateOfinterst(){

        System.out.println("genrally bank given 5% ");
    }

}
class sbi  extends bank{
    @Override
    public void rateOfinterst() {
        System.out.println("sbi given 7%");
    }
}
class myBank extends bank{
    @Override
    public void rateOfinterst() {
        System.out.println("my bank given 10%");
    }}

    public class polymorphism {
    public static  void main(String []arg){
        myBank ji=new myBank();
        sbi sb = new sbi();
        ji.rateOfinterst();
        sb.rateOfinterst();

    }
}
