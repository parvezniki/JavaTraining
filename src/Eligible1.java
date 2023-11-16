import java.util.Scanner;

public class Eligible1 {
    public static void main(String[] args) {
        String Name;
        int Age;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of a person :");
        Name = s.nextLine();

        System.out.println("Enter Age of a person :");
        Age = s.nextInt();

        System.out.println("Enter gender :");
        String gen = s.nextLine();

        System.out.println("--------------------------------");


        /*if (gen.equals("male"))
        {
            if (Age >= 21)
            {
                System.out.println(Name + " is eligible for marriage");
            }
            else
            {
                System.out.println(Name + " is eligible for marriage");
            }
        }
        else if (gen.equals("female"))
        {
            if(Age>=18)
            {
                System.out.println(Name+" is eligible for marriage");
            }
            else
            {
                System.out.println(Name+" is eligible for marriage");
            }
        }*/
    }
}
