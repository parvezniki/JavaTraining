import java.util.Scanner;

public class TereneryOp1 {
    public static void main(String []args) {
        Scanner sc1 = new Scanner(System.in);
        //  = CONDITION ? TRUE : FALSE ;
        //  = <condition> ? <When TRUE: this expression is evaluated>  : <When FALSE: this expression is evaluated> ;
        int n;
        String value;
        System.out.print("Enter a number: ");
        n = sc1.nextInt();

        value = (n>0) ? "POSITIVE" : "NEGATIVE" ;

        System.out.println(n + " is a " + value + " number ");
        //                 12 is a POSITIVE number
    }
}
