import java.util.Scanner;

public class ArraysSort2 {
    public static void main(String []args) {
        int a[] = new int[5];
        int i,j;
        Scanner sc = new Scanner(System.in);
        // Take Input
        System.out.print("Enter 5 numbers: ");
        for(i=0;i<5;i++) {
            a[i] = sc.nextInt();
        }


        // Do Sorting
        for(i=0;i<a.length-1;i++)
        {
            for(j=0;j<a.length-1-i;j++)
            {
                if(a[j] > a[j+1]) {
                    a[j] = (a[j] + a[j+1]) - (a[j+1] = a[j]);
                }
            }
        }



        // Show output
        for(i=0;i<5;i++) {
            System.out.print(a[i]+"  ");
        }

    }
}
