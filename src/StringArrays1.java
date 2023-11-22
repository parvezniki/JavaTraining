import java.util.Scanner;

public class StringArrays1 {
    public static void main(String []args) {
        String []strarr = new String[5];
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Enter 5 fruit names: ");
        for(i=0;i<strarr.length;i++) {
            strarr[i] = sc.next();
        }

        for(i=0;i<strarr.length;i++) {
            System.out.println(strarr[i]);
        }

        for(String val:strarr) { // FOR EACH        0 -> length-1
            System.out.println(val);
        }
    }
}
