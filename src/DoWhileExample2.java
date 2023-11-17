import java.util.Scanner;

public class DoWhileExample2 {
    public static void main(String []args) {
        int n;
        String option ;
        Scanner sc = new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("****** Java Multiplication Table Program *******");
        System.out.println("************************************************");

        do {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            printMulTable(n);

            System.out.print("Do you want to print another table?, Enter 'Yes' to continue :");
            option = sc.next();
        } while( option.equalsIgnoreCase("Yes") );

        System.out.println("************************************************");
    }

    static void printMulTable(int p) { // Method or Function
        int i = 1;
        while(i<=10) {
            System.out.println(p+" x "+i+" = "+(p*i));
            i = i + 1;
        }
    }
}
