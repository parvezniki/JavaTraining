import java.util.Scanner;

/*
8) write a program to insert a given number at the specefic location in the array
	I/P:	1 2 3 2 5   3 8 1 10 0 0 0 0
      Index:	0 1 2 3 [4] 5 6 7 8
 IndexInput:	4
 ValueInput:	100
	O/P:	1 2 3 100 -> 2 5 3 8 1 10 0 0 0
 */
public class ArrayInsertAtGivenLocation {
    public static void main(String []args) {
        int a[] = {1,2,3,2,5,3,8,1,10,0,0,0,0};
        int i;
        int indexInput,valueInput;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index where you want to insert?: ");
        indexInput = sc.nextInt();
        System.out.print("Enter an integer value to be inserted: ");
        valueInput = sc.nextInt();
        System.out.println("Array before inserting");
        System.out.println("------------------------");
        for(i=0;i<a.length;i++) {
            System.out.print(a[i]+",");
        }
        System.out.println();
        for(i=a.length-1;i>=indexInput;i--) {
            a[i] = a[i-1];
        }
        a[indexInput] = valueInput;
        System.out.println("Array after inserting");
        System.out.println("------------------------");
        for(i=0;i<a.length;i++) {
            System.out.print(a[i]+",");
        }
    }
}
