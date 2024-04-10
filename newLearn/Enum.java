package newLearn;

import java.util.Scanner;

enum status{
    running , failed, success,pannding;
}
public class Enum {
    public static void main(String[] arg) {
       // status s = status.success;
       // System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        switch (status.valueOf(s)){
            case success :
                System.out.println("this is success status");
                break;
            case failed:
                System.out.println("this is failed status");
                break;
            case running:
                System.out.println("this is running  status");
                break;
            case pannding:
                System.out.println("this is pannding status");
                break;
            default:
                System.out.println("no status is present in enumm");
        }
    }
}