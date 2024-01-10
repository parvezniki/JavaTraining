public class ExceptionsTestProg1 {
    public static void main(String []args) {
        System.out.println(testMethod());
    }
    static int testMethod() {
        try {
            return 1;
        } catch(Exception e) {
            return 2;
        } finally {
            return 3;
        }

    }
}
