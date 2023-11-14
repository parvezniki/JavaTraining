
import java.util.Scanner;
// Conditional statements   -> if - else
public class StudentProgram4withIf {
    public static void main(String []args) {
        Scanner sc1 = new Scanner(System.in);
        String studname;
        String rollNumber;
        double math,social,science,telugu,hindi,english;
        double total;
        double average;


        System.out.print("Enter Student Name: ");
        studname = sc1.nextLine();
        System.out.print("Enter Student Rollnumber: ");
        rollNumber = sc1.nextLine();

        System.out.println("Enter marks for math,social,science,telugu,hindi,english : ");
        math = sc1.nextDouble();
        /*
            if(math>=0 && math<=100)  --->   if maths marks are greater than zero  AND maths marks are less than 100 then FINE
                                      --->   if maths marks are less than zero OR maths marks are greater than 100 then NOT FINE
          */
        if(math<0 || math>100)
        {
            System.out.println("Invalid Input, Marks between 0 and 100 are only accepted.");
            return;
        }

        social = sc1.nextDouble();
        if(social<0 || social>100)
        {
            System.out.println("Invalid Input, Marks between 0 and 100 are only accepted.");
            return;
        }
        science = sc1.nextDouble();
        if(science<0 || science>100)
        {
            System.out.println("Invalid Input, Marks between 0 and 100 are only accepted.");
            return;
        }
        telugu = sc1.nextDouble();
        if(telugu<0 || telugu>100)
        {
            System.out.println("Invalid Input, Marks between 0 and 100 are only accepted.");
            return;
        }
        hindi = sc1.nextDouble();
        if(hindi<0 || hindi>100)
        {
            System.out.println("Invalid Input, Marks between 0 and 100 are only accepted.");
            return;
        }
        english = sc1.nextDouble();
        if(english<0 || english>100)
        {
            System.out.println("Invalid Input, Marks between 0 and 100 are only accepted.");
            return;
        }

        total = math + social + science + telugu  + hindi + english;
        average = total / 6;

        System.out.println("-----------------------------");
        System.out.println(studname);
        System.out.println("-----------------------------");
        System.out.println("Rollnumber  : "+rollNumber);
        System.out.println("Total       : "+total);
        System.out.println("Average     : "+average);

        if(math>=35 && social>=35 && science>=35 && telugu>=35 && hindi>=35 && english>=35 ) //ampersand  -- AND
        {
            System.out.println("Result      : "+"PASS");
        } else {
            System.out.println("Result      : "+"FAIL");
        }

        System.out.println("-----------------------------");

    }
}
