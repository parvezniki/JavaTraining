import java.util.Scanner;

// Search in an array
public class ArraysProg3 {
    public static void main(String []args) {
        int arr1[] = new int[5];
        int i,val1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + arr1.length + " numbers: ");
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Please enter a number to search: ");
        val1 = sc.nextInt();
        boolean isFound = false; // false - not found AND true - found
        for (i = 0; i < arr1.length; i++) {
            if(val1 == arr1[i]) {
                isFound = true;
                break;
            } else {
                isFound = false;
            }
        }

        if(isFound) {
            System.out.println(val1 + " is found");
        } else {
            System.out.println(val1 + " is not found");
        }

    }
}
