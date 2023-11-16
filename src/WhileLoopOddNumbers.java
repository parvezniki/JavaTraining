import java.util.Scanner;

public class WhileLoopOddNumbers {
    public static void main(String []args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        i = 2;
        while(i<=n) {
            System.out.println(i);
            i = i + 2;
        }

    }
}
