import java.util.Scanner;

public class LoopsMulTable1 {
    public static void main(String []args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        i = 1;
        while(i<=10) {
            /* 5 x 1 = 5
            *  5 x 2 = 10
            *  5 x 3 = 15
            *  ...
             */
            System.out.println(n+" x "+i+" = "+(n*i));
            i = i + 1;
        }

    }
}
