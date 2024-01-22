public class RecursiveFuntion1 {
    public static void main(String []args) {
//        printNumbers(10);

//        System.out.println(sumOfNumbers(5)); // 5 + 4 + 3 + 2 + 1
        System.out.println(factorialOfANumber(5)); // 5 x 4 x 3 x 2 x 1

        // Write a Method to print finonacci series
        // Ex. 0 1 1 2 3 5 8 13 21 .....
    }

    public static void printNumbers(int n) {
        System.out.println(n);
        if(n>1) {
            printNumbers(n - 1);
        }
    }

    public static int sumOfNumbers(int n) {
        if(n != 0) {
            return n + sumOfNumbers(n - 1);
        } else {
            return n;
        }
    }

    public static int factorialOfANumber(int n) {
        if(n != 1) {
            return n * factorialOfANumber(n - 1);
        } else {
            return n;
        }
    }
}
