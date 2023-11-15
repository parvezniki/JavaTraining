import java.util.Scanner;

public class TerineryOp3 {
    // Program to check if the given integer input is odd or even using terinery operator
    public static void main(String []args) {
        int n;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numeric value: ");
        n = sc.nextInt();

        result = (n%2 == 0) ? "EVEN Number" : "ODD Number";

        System.out.println(n + " is " + result);

    }
}


