import java.util.Scanner;

public class Arrays2D {
    public static void main(String []args) {
        int a[][] = new int[3][3];
        int row,col;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 9 values: ");

        for(row=0;row<3;row++){
            for(col=0;col<3;col++) {
                a[row][col] = sc.nextInt();
            }
        }

        for(row=0;row<3;row++) {
            for (col = 0; col < 3; col++) {
                System.out.print(a[row][col]+"  ");
            }
            System.out.println();
        }
    }
}
