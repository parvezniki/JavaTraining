import java.util.Scanner;

public class Arrays2DMulti {
    public static void main(String []args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        int p,q,r;
        Scanner sc = new Scanner(System.in);

        // Taking input into 1st array of 3x3 size
        System.out.println("Enter 9 values for the 1st array of size 3x3: ");
        for (p = 0; p < 3; p++) {
            for (q = 0; q < 3; q++) {
                a[p][q] = sc.nextInt();
            }
        }

        // Taking input into 2st array of 3x3 size
        System.out.println("Enter 9 values for the 2nd array of size 3x3: ");
        for (p = 0; p < 3; p++) {
            for (q = 0; q < 3; q++) {
                b[p][q] = sc.nextInt();
            }
        }

        for (p = 0; p < 3; p++) {
            for (q = 0; q < 3; q++) {
                c[p][q] = 0;
                for(r=0;r<3; r++) {
                    c[p][q] += a[p][r] * b[r][q];
                }
            }
        }

        for (p = 0; p < 3; p++) {
            for (q = 0;q < 3;q++) {
                System.out.print(c[p][q]+"   ");
            }
            System.out.println();
        }

    }
}
