public class SwappingOfNumbers {
    public static void main(String []args) {
        int a = 10; // 32bits
        int b = 20; // 32bits
        int temp = 0; // 32bits
        // Input
        System.out.println("Before swapping the values of a and b are");
        System.out.println("value of a = "+a);
        System.out.println("value of b = "+b);

        // Swap logic
        temp = a;
        a = b;
        b = temp;

        // Output
        System.out.println("After swapping the values of a and b are");
        System.out.println("value of a = "+a);
        System.out.println("value of b = "+b);


    }
}
