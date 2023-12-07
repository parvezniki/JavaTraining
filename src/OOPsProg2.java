public class OOPsProg2 {
    public static void main(String args[]) {
        System.out.println("   FUNCTION OVERLOADING ");
        FuncOverloading fo = new FuncOverloading();
        int k;

        k = fo.add();
        System.out.println(k);

        k = fo.add(10,20);
        System.out.println(k);

        k = fo.add(10,20,100);
        System.out.println(k);

        double d = fo.add(10.50,20.56);
        System.out.println(d);

        d = fo.add(10.50,20.56,44.56);
        System.out.println(d);
    }
}



class FuncOverloading {
    int add() {
        System.out.println("Method called: int add() ");
        return 100+200;
    }

    int add(int x1,int x2) // --> signature
    {  // Function body (or) function definition
        int result;
        System.out.println("Method called: int add(int p1,int p2) ");
        result = x1 + x2;
        return result;
    }

    double add(double p1,double p2)
    {
        double result;
        System.out.println("Method called: double add(double p1,double p2)");
        result = p1 + p2;
        return result;
    }

    double add(double p1,double p2,double k4)
    {
        double result;
        System.out.println("Method called: double add(double p1,double p2,double k4)");
        result = p1 + p2 + k4;
        return result;
    }

    int add(int p1,int p2,int p3)  // --> signature
    {  // Function body (or) function definition
        int result;
        System.out.println("Method called: int add(int p1,int p2,int p3)");
        result = p1 + p2 + p3;
        return result;
    }
}