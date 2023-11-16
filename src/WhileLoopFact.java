import java.util.Scanner;

public class WhileLoopFact {
    public static void main(String []args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        // fact -> 24
        // 5!  --> 1 x 2 x 3 x 4 x [5]
        int fact = 1;

        i = 1;
        while(i <= n) {
            fact = fact * i;
            i = i + 1;
        }
        System.out.println("Factorial of "+n+" is = "+fact);
    }
}
