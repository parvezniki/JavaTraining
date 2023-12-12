public class Inheritance1 {
    public static void main(String []arg) {
//        ClassX objx1 = new ClassX();
//        objx1.xMethodPubl1();

        ClassY objy1 = new ClassY();
        objy1.yMethodPubl1();

        objy1.xPubl1 = "I'm Inherited xPbll1 var";
        objy1.xPubl2 = "I'm Inherited xPbll2 var";
        objy1.xMethodPubl1();
    }
}
//----------------------------
class ClassX {
    private String xPriv1="X: I'm Priv1 String Variable",xPriv2="X: I'm Priv2 String Variable";
    public String xPubl1="X: I'm Publ1 String Variable",xPubl2="X: I'm Publ2 String Variable";

    private void xMethodPriv1() {
        System.out.println("I'm private 1 method from ClassX");
    }
    private void xMethodPriv2() {
        System.out.println("I'm private 2 method from ClassX");
    }
    public void xMethodPubl1() {
        System.out.println("I AM CLASS-X METHOD");
        System.out.println("Calling PRivate method 1 from public class");
        xMethodPriv1();
        System.out.println("Calling PRivate method 2 from public class");
        xMethodPriv2();
        System.out.println("I'm public 1 method from ClassX");
        System.out.println("Private Properties of this class are ");
        System.out.println(xPriv1);
        System.out.println(xPriv2);
        System.out.println("Public Properties of this class are ");
        System.out.println(xPubl1);
        System.out.println(xPubl2);
        System.out.println("-----------------------------------");
    }
}
class ClassY extends ClassX {
    private String yPriv1="Y: I'm Priv1 String Variable",yPriv2="Y: I'm Priv2 String Variable";
    public String yPubl1="Y: I'm Publ1 String Variable",yPubl2="Y: I'm Publ2 String Variable";

    private void yMethodPriv1() {
        System.out.println("I'm private 1 method from ClassY");
    }
    private void yMethodPriv2() {
        System.out.println("I'm private 2 method from ClassY");
    }
    public void yMethodPubl1() {
        System.out.println("I AM CLASS-Y METHOD");
        System.out.println("Calling PRivate method 1 from public class");
        yMethodPriv1();
        System.out.println("Calling PRivate method 2 from public class");
        yMethodPriv2();
        System.out.println("I'm public 1 method from ClassY");
        System.out.println("Private Properties of this class are ");
        System.out.println(yPriv1);
        System.out.println(yPriv2);
        System.out.println("Public Properties of this class are ");
        System.out.println(yPubl1);
        System.out.println(yPubl2);
        System.out.println("-----------------------------------");
    }
}


