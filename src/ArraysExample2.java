import java.util.Scanner;

public class ArraysExample2 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int array [] = new int[6];      //  <datatype> [] <arrayname> = new <datatype>[<size>];
//      [] [] [] [] [] []
//       0  1  2  3  4  5

//        array[0] = sc.nextInt();
//        array[1] = sc.nextInt();
//        array[2] = sc.nextInt();
//        array[3] = sc.nextInt();
//        array[4] = sc.nextInt();
//        array[5] = sc.nextInt();
        System.out.print("Please enter 6 numbers: ");
        for( i=0;i<6;i++) {
            array[i] = sc.nextInt();
        }

//        System.out.println("allocation 0 value: "+array[0]);
//        System.out.println("allocation 1 value: "+array[1]);
//        System.out.println("allocation 2 value: "+array[2]);
//        System.out.println("allocation 3 value: "+array[3]);
//        System.out.println("allocation 4 value: "+array[4]);
//        System.out.println("allocation 5 value: "+array[5]);

        for(i=0;i<6;i++) {
            System.out.println("allocation "+ i +" value: "+array[i]);
        }



    }
}
