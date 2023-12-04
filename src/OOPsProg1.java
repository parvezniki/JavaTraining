import java.util.Scanner;

public class OOPsProg1 {
    public static void main(String args[]) {
//        int x;  // declare variable
//        x = 10; // initialize -> assigning first value to it
//        System.out.print(x); // make use of it

        System.out.println("Initializing obj1");
        System.out.println("----------------------");
        ClassA obj1; // declare object
        obj1 = new ClassA(10,20,30); // initialize object
        obj1.whoAmI();
//        obj1.a1 = 10;
//        obj1.a2 = 20;
//        obj1.a3 = 30;
        obj1.showVariableValues();

        System.out.println("Initializing obj2");
        System.out.println("----------------------");
        ClassA obj2 = new ClassA(100,200,300);
        obj2.whoAmI();
//        obj2.a1 = 100;
//        obj2.a2 = 200;
//        obj2.a3 = 300;
        obj2.showVariableValues();

        System.out.println("Initializing obj3");
        System.out.println("----------------------");
        ClassA obj3 = new ClassA(-10,-20,-30);
        obj3.whoAmI();
//        obj3.a1 = -10;
//        obj3.a2 = -20;
//        obj3.a3 = -30;
        obj3.showVariableValues();

        System.out.println("Initializing obj4");
        System.out.println("----------------------");
        ClassA obj4 = new ClassA();
    }
}





class ClassA {
    // Properties of ClassA
    private int a1,a2,a3;

    // default constructor
    ClassA() {
        System.out.println("I am default constructor ");
    }
    // Constructor
    ClassA(int p1,int p2,int p3) {
        a1 = p1;
        a2 = p2;
        a3 = p3;
    }
    ClassA(int p1,int p2) {
        a1 = p1;
        a2 = p2;
    }
    // Behaviours / Methods / Functions of ClassA
    void whoAmI() {
        System.out.println("I am Class A");
    }
    void showVariableValues() {
//        System.out.println("a1 = "+a1+"\na2 = "+a2+"\na3 = "+a3);

        System.out.println("a1 = "+a1);
        System.out.println("a2 = "+a2);
        System.out.println("a3 = "+a3);
    }
}
