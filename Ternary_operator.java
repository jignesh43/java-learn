public class Ternary_operator {

    public static  void main(String []arg){
 //condition ? expression1 : expression2
      /*  int a=5;
        System.out.println((a > 5) ? "true" : "false");*/
        int num = 10;
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println("The number is " + result);
    }
}
