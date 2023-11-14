import java.util.Scanner;

public class IfExample2 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if(  n%2 == 0 )         //     <  >   <=   >=   ==  !=     !       %  -> Modulus operator
        {
            System.out.println(n+" is Even number");
        }
        else {
            System.out.println(n+" is Odd Number");
        }



    }
}
