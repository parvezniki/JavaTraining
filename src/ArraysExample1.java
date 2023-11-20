public class ArraysExample1 {
    public static void main(String []args) {

        int array [] = new int[6];      //  <datatype> [] <arrayname> = new <datatype>[<size>];
//      [] [] [] [] [] []
//       0  1  2  3  4  5

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        array[5] = 60;

        System.out.println("1st allocation value: "+array[0]);
        System.out.println("2st allocation value: "+array[1]);
        System.out.println("3st allocation value: "+array[2]);
        System.out.println("4st allocation value: "+array[3]);
        System.out.println("5st allocation value: "+array[4]);
        System.out.println("6st allocation value: "+array[5]);


    }
}
