import java.util.Scanner;

public class SgtringArray3 {
    public static void main(String []args) {
        String[] strarr = {"apple","banana","kivi","waterwater","cherry"};
        Scanner sc = new Scanner(System.in);
        String searchVal;
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
