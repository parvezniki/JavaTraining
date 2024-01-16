import java.util.Scanner;

public class NullPointerEx1 {
    public static void main(String []args) throws Exception {
        String name = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        try {
            System.out.println("My First Name is: " + name.split(" ")[0]);
            System.out.println("My Last Name is: " + name.split(" ")[1]);
        } catch(NullPointerException npe) {
            System.out.println("You can't split null values you idiot.");
        }

        System.out.println("Stements after the try block");
        System.out.println("Stements after the try block");
        System.out.println("Stements after the try block");

    }
}
