import java.util.Scanner;

// Program to check the voting eligibility of a person
public class UserDefinedExcptions {
    public static void main(String []args) throws Throwable {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        name = sc.nextLine();
        System.out.print("Enter a Age: ");
        age = sc.nextInt();

        //AgeValidationException aveException = new AgeValidationException();
        if(age<18) {
            //throw new Exception(name+" is not eligible for voting");
            throw new AgeValidationException(name+" is not eligible for voting");
        }
    }
}
