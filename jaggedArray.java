import java.util.Scanner;

public class jaggedArray {
    public static void main (String [] arg){
        Scanner scanner = new Scanner(System.in);

        //array
        int [][] num = new int[4][];
        num[0]=new int[4];
        num[1]=new int[2];
        num[2]=new int[3];
        num[3]=new int[4];
        // Input values
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter values for row " + (i + 1));
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("Enter value for column " + (j + 1));
                try {
                    int value = scanner.nextInt();
                    num[i][j] = value;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    // Consume invalid input
                    scanner.next();
                    j--; // Decrement j so the user can re-enter the value
                }
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();

        // Output array
        System.out.println("The array is:");
        for (int[] row : num) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}