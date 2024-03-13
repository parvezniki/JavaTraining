import java.util.Scanner;

/**
 * 4) Take input only ranging between 1 and 7, Display name of the day basing on the input value using Terinery operator
 *
 * Ex.
 * I/P
 * Enter a number: 2
 *
 * O/P
 * Monday
 */
public class Ternery5 {
    public static void main(String []args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1-7: ");
        n = sc.nextInt();
        if( !(n>=1 && n<=7) ) {
            System.out.println("Invalid input");
            return;
        }

        String result = "";
        result = (n==1) ? "SUNDAY" :
                        (n==2) ? "MONDAY" :
                                 (n==3) ? "TUESDAY" :
                                         (n==4) ? "WEDNESDAY" :
                                                 (n==5) ? "THURSDAY" :
                                                         (n==6) ? "FRIDAY" : "SATURDAY";
        System.out.println(n + " = "+ result);
    }
}
