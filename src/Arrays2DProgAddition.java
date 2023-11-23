import java.util.Scanner;

/*
    Program to demonstrate addition of two 3x3 arrays and display the result
 */
public class Arrays2DProgAddition {
    public static void main(String []args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        int row,col;
        Scanner sc = new Scanner(System.in);

        // Taking input into 1st array of 3x3 size
        System.out.println("Enter 9 values for the 1st array of size 3x3: ");
        for(row=0;row<3;row++) {
            for(col=0;col<3;col++) {
                a[row][col] = sc.nextInt();
            }
        }

        // Taking input into 2st array of 3x3 size
        System.out.println("Enter 9 values for the 2nd array of size 3x3: ");
        for(row=0;row<3;row++) {
            for(col=0;col<3;col++) {
                b[row][col] = sc.nextInt();
            }
        }

        // Traversing through each allocatoin of array A and array B, and performing the addition operation and storing the result in array C
        for(row=0;row<3;row++) {
            for (col = 0; col < 3; col++) {
                c[row][col] = a[row][col] + b[row][col];
            }
        }

        // Print the result stored in array C
        for(row=0;row<3;row++) {
            for (col = 0; col < 3; col++) {
                System.out.print(c[row][col]+"  ");
            }
            System.out.println();
        }
    }
}
