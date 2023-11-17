import java.util.Scanner;

public class ForLoopExample1 {
    public static void main(String []args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        // for(<init>; <cond>; <re-init>)
        for(i=1; i<=n; i++) {
            System.out.println(i);  // loop statements (or) loop block
        }


    }
}
