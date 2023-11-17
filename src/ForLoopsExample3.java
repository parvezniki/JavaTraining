import java.util.Scanner;

public class ForLoopsExample3 {
    public static void main(String []args) {
        int n;
        String option = "Yes";
        Scanner sc = new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("****** Java Multiplication Table Program *******");
        System.out.println("************************************************");
        // for(<init>; <condition>; <re-init>)
        for( ; option.equalsIgnoreCase("Yes"); ) {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            printMulTable(n);

            System.out.print("Do you want to print another table?, Enter 'Yes' to continue :");
            option = sc.next();
        }
        System.out.println("************************************************");
    }

    static void printMulTable(int p) { // Method or Function

        for(int i=1; i<=10; i++) {
            System.out.println(p+" x "+i+" = "+(p*i));
        }
    }
}
