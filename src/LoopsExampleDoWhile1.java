import java.util.Scanner;

public class LoopsExampleDoWhile1 {
    public static void main(String []args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        i = 1; // initialization statement
        do { // condition statement
            System.out.println(i);
            i+=1; // re-initialization statement         // i=i+1        i++     ++i     i+=5
        } while(i<=n);

    }
}
