public class SappingOfNumber2 {
    public static void main(String []args) {
        int a = 10; // 32bits
        int b = 20; // 32bits

        // Input
        System.out.println("Before swapping the values of a and b are");
        System.out.println("value of a = "+a);
        System.out.println("value of b = "+b);

        // Swap logic
        a = (a + b) - (b = a);

        // Output
        System.out.println("After swapping the values of a and b are");
        System.out.println("value of a = "+a);
        System.out.println("value of b = "+b);

    }
}
