import java.util.Scanner;

public class IfElseLeapYear {
    //    LEAP YEAR:: 2025 -> (devisible by 4) AND (devisible by 400) AND (it should not be devisible by 100)
    public static void main(String []args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year :");
        n = sc.nextInt();

        if( n%4 == 0 && (n%100!=0 || n%400==0)  ) {
            System.out.println(n + " is a LEAP YEAR");
        } else {
            System.out.println(n + " is not a LEAP YEAR");
        }
    }
}
