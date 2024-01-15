import java.util.Scanner;

public class Excpetions1 {
    public static void main(String []args) {
        System.out.println("This is the start of the program");
        String str1="100";
        int x=0;
        String str2 = "Pinapple";
        // Statements to Open the DB/Network connection
        try {
            // Do DB/Network operations using the ablove open connection
            System.out.println("I am a safe statement, and I may not cause any exception");
            x = Integer.parseInt(str1);
            System.out.println(str2.substring(1,4));
        } catch(NumberFormatException nfe) {
            System.out.println("Hey, Correct your input.");
        } catch(NullPointerException nfe) {
            System.out.println("Hey, Correct your input.");
        } catch(ArrayIndexOutOfBoundsException aie) {
            System.out.println("Array Index Out of bounds exception.");
        } finally{
            System.out.println("Hey, I'm Finally Block");
            // Close the DB/Network connections
        }

        try {
            // Do DB/Network operations using the ablove open connection
            System.out.println("I am a safe statement, and I may not cause any exception");
            x = Integer.parseInt(str1);
            System.out.println(str2.substring(1,4));
        } catch(NumberFormatException |NullPointerException|ArrayIndexOutOfBoundsException ex) {
            System.out.println("Hey, Correct your input.");
        } finally{
            System.out.println("Hey, I'm Finally Block");
            // Close the DB/Network connections
        }
        System.out.println(x);
        System.out.println("This is the ENd of the program");
    }
}
