import java.util.Scanner;

public class TerineryOp2 {
    public static void main(String []args) {
        Scanner sc1 = new Scanner(System.in);
        //  = CONDITION ? TRUE : FALSE ;
        //  = <condition> ? <When TRUE: this expression is evaluated>  : <When FALSE: this expression is evaluated> ;
        int age;
        String value,name;

        System.out.print("Enter Name of the Voter : ");
        name = sc1.nextLine();
        System.out.print("Enter Age of the Voter : ");
        age = sc1.nextInt();
        if( !(age>=0 && age<=80) ) { System.out.println("Invalid Age entered."); return; }

        value = (age>=18) ? "ELIGIBLE" : "NOT ELIGIBLE" ;

        System.out.println(name + " is " + value);
                // Parvez is ELIGIBLE

    }
}
