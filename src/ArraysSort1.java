import java.util.Scanner;

public class ArraysSort1 {
    public static void main(String []args) {
        int a[] = new int[5];
        int i,j;
        Scanner sc = new Scanner(System.in);
        // Take Input
        System.out.print("Enter 5 numbers: ");
        for(i=0;i<5;i++) {
            a[i] = sc.nextInt();
        }

        int temp=0;

        // Do Sorting
        for(i=0;i<a.length-1;i++) {
            for(j=i+1;j<a.length;j++) {
                if(a[i] > a[j]) {
                    //a[i] = (a[i]+a[j]) - (a[j]=a[i]);     // swapping
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Show output
        for(i=0;i<5;i++) {
            System.out.print(a[i]+"  ");
        }

    }
}
