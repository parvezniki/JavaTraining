import java.util.Scanner;

// Program to find out the max value in the given array
public class ArraysProg2 {
    public static void main(String []args) {
        int arr1[] = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + arr1.length + " numbers: ");
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int max=arr1[0];
        for(i=1; i < arr1.length; i++) {
            if(max < arr1[i])
            {
                max = arr1[i];
            }
        }

        System.out.println(max);
    }
}
