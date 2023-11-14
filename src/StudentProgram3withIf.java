
import java.util.Scanner;
// Conditional statements   -> if - else
public class StudentProgram3withIf {
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
        social = sc1.nextDouble();
        science = sc1.nextDouble();
        telugu = sc1.nextDouble();
        hindi = sc1.nextDouble();
        english = sc1.nextDouble();

        if ( (math<0 || math>100) || (social<0 || social>100) || (science<0 || science>100) ||
             (telugu<0 || telugu>100) || (hindi<0 || hindi>100) || (english<0 || english>100) )  {
            System.out.println("Invalid Input, marks cannot be less than zero / greater than 100");
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
/*
    Distinction -->   >=70%
    1st class   -->   >=60%
    2nd class   -->   >=50%
    3rd class   -->   <50%

 */
        if(math>=35 && social>=35 && science>=35 && telugu>=35 && hindi>=35 && english>=35 ) //ampersand  -- AND
        {
            System.out.println("Result      : "+"PASS");

            if( average >= 70) {
                System.out.println("Grade       : "+"DISTINCTION");
            } else if(average >=60 ) {
                        System.out.println("Grade       : "+"First Class");
                    } else if(average >=50 ) {
                        System.out.println("Grade       : "+"Second Class");
                    } else {
                            System.out.println("Grade       : "+"Third Class");
                        }

        } else {
            System.out.println("Result      : "+"FAIL");
        }

        System.out.println("-----------------------------");

    }
}
