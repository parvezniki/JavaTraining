import java.util.Scanner;

public class DaysOfAWeek1 {
    public static void main(String []args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        n = sc.nextInt();

        if(n==1)  System.out.println("SUNDAY");
        else if(n==2)   System.out.println("MONDAY");
        else if(n==3)   System.out.println("TUESDAY");
        else if(n==4)   System.out.println("WEDNESDAY");
        else if(n==5)   System.out.println("THURSDAY");
        else if(n==6)   System.out.println("FRIDAY");
        else if(n==7)   System.out.println("SATURDAY");
        else System.out.println("Invalid Input");
    }
}
