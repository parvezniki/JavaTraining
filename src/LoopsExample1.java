import java.util.Scanner;

public class LoopsExample1 {
    public static void main(String []args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
// iteration
        i = 1; // initialization statement
        while(i<=n) { // condition statement
            System.out.println(i);
            i = i + 1; // re-initialization statement           -> x++ , x-- {Post increment op, Post decrement}    --> +=n  -= *= /= %=
                                                        //      -> ++x , --x {Pre increment op, Pre decrement}
        }

    }
}
