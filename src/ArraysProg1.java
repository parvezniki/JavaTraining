import java.util.Scanner;

public class ArraysProg1 {
    public static void main(String []args) {
        int arr1 [] = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter "+arr1.length+" numbers: ");
        for(i=0;i<arr1.length;i++) {
            arr1[i] = sc.nextInt();
        }
        int ans=1;
        for(i=0;i<arr1.length;i++) {  // 0 1 2 3 4
            ans = ans * arr1[i];
        }

        System.out.println("Product of all the values in the array is: "+ans);
    }
}
