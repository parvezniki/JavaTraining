public class OOPsProg4 {
    public static void main(String []arg) {
        FamilyOne f1 = new FamilyOne();
        f1.a = 10;
        f1.method2();
        FamilyOne f6 = new FamilyOne();
        f6.method2();


        FamilyOne fam1 = new FamilyOne();
        FamilyOne fam2 = new FamilyOne();

    }
}

class FamilyOne {
    int a, b, c;
    private void method1() {
        System.out.println("Hi I'm method1() of FamilyOne");
    }
    void method2() {
        method1();
        System.out.println("Hi I'm method2() of FamilyOne");
        method3();
    }

    private void method3() {
        System.out.println("Hi I'm method3() of FamilyOne");
    }
}


class FamilyTwo {
    int a, b, c;
    void method1() {
        System.out.println("Hi I'm method1() of FamilyTwo");
    }
    void method2() {
        System.out.println("Hi I'm method2() of FamilyTwo");
    }
}