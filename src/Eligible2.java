import java.util.Scanner;

public class Eligible2 {
    public static void main(String []args) {
        String name,gender;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter gender: ");
        gender = sc.next();

        if(gender.equalsIgnoreCase("male")) {
            if(age>=21) {
                System.out.println(name+" is Eligible for marriage");
            } else {
                System.out.println(name+" is not Eligible for marriage");
            }
        } else if(gender.equalsIgnoreCase("female")) {
            if(age>=18) {
                System.out.println(name+" is Eligible for marriage");
            } else {
                System.out.println(name+" is not Eligible for marriage");
            }
        }

    }
}
