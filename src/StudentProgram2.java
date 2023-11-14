
import java.util.Scanner;
// Conditional statements   -> if - else
public class StudentProgram2 {
    public static void main(String []args) {
        Scanner sc1 = new Scanner(System.in);
        String studname;
        String rollnumber;
        int math,social,science,telugu,hindi,english;
        int total;
        float average;


        System.out.print("Enter Student Name: ");
        studname = sc1.nextLine();
        System.out.print("Enter Student Rollnumber: ");
        rollnumber = sc1.nextLine();

        System.out.println("Enter marks for math,social,science,telugu,hindi,english : ");
        math = sc1.nextInt();
        social = sc1.nextInt();
        science = sc1.nextInt();
        telugu = sc1.nextInt();
        hindi = sc1.nextInt();
        english = sc1.nextInt();

        total = math + social + science + telugu  + hindi + english;
        average = total / 6;

        System.out.println("-----------------------------");
        System.out.println(studname);
        System.out.println("-----------------------------");
        System.out.println("Rollnumber  : "+rollnumber);
        System.out.println("Total       : "+total);
        System.out.println("Average     : "+average);
        System.out.println("-----------------------------");

    }
}
