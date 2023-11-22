import java.util.Scanner;

public class StringArray2 {
    public static void main(String []args) {
        String[] strarr = new String[5];
        Scanner sc = new Scanner(System.in);
        int i;
        String searchVal;
        System.out.print("Enter 5 fruit names: ");
        for (i = 0; i < strarr.length; i++) {
            strarr[i] = sc.next();
        }
        System.out.print("Enter a value to search: ");
        searchVal = sc.next();
        boolean match = false;
        for(String value:strarr) { // FOR EACH
            if(value.equalsIgnoreCase(searchVal)) { //  Apple == APPLE
                match = true;
                break;
            }
        }

        if(match) System.out.println(searchVal+ " is found in the array");
        else System.out.println(searchVal+ " is NOT found in the array");

    }
}
