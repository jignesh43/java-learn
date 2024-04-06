import java.util.Scanner;

public class Array3 {
    public static void main(String [] arg) {
        int [][] num =new int[4][3];
        for (int i=0;i<num.length;i++){
            for (int j=0;j<num[i].length;j++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            num[i][j]=number;
        }
            // Output the 2D array
            System.out.println("Entered 2D array:");
            for (int k = 0; k < num.length; k++) {
                for (int j = 0; j < num[i].length; j++) {
                    System.out.print(num[i][j] + " ");
                }
                System.out.println(); // Move to the next line after each row
            }


            // Close the scanner

        }
    }
}
