import java.util.Scanner;

public class OddEvenSwitchCasePrg1 {
    public static void main(String []args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        n = sc.nextInt();

            switch( n%2 ) {
                case 1: System.out.println(n + " is an Odd Number"); break;
                case 0: System.out.println(n + " is an Even Number"); break;
            }
    }
}
