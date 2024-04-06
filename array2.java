import java.util.Scanner;

public class array2 {
    public static void main(String [] arg) {
   int []num=new int[5];
   for (int i=0;i<num.length;i++){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        num[i]=number;
   }
   for (int k:num){
       System.out.println(k);
   }

    }
    }

