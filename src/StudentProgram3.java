import java.util.Scanner;

public class StudentProgram3 {
    public static void main(String []args)
    {
        Scanner sc1 = new Scanner(System.in);
        String studentname;
        String rollnumber;
        int math,social,science,telugu,hindi,english;
        int total;
        float average;

        System.out.println("Enter Student Name: ");
        studentname = sc1.nextLine();
        System.out.println("Enter Student Rollnumber: ");
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

        System.out.println("studentname"+studentname);
        System.out.println("math + Social + Science + telugu + hindi + english");
        System.out.println("total"+total);
        System.out.println("average"+average);

    }
}
