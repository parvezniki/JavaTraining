import java.io.File;
import java.io.FileWriter;

public class ExceptionTest2 {
    public static void main(String []args) {

        String str1 = "parvez";
        String str2 = "560";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1+str2);
        int sum=0;
        try {
            sum = Integer.parseInt(str1) + Integer.parseInt(str2);
        } catch(NumberFormatException nfe) {
            System.out.println("Bhai tu name ko number me convert nai karsakta");
        }
        System.out.println(sum);
    }
}
