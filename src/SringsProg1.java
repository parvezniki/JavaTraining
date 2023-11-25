public class SringsProg1 {
    public static void main(String []args) {
        String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s2 = "This is a sample string value";
        int i;
        // Length of a string
        System.out.println("Length of the string is: "+s1.length());
        if(s2.contains("sample")) System.out.println("Given string s2 contains :"+"sample");
        else  System.out.println("Given string s2 does not contain :"+"sample");
        System.out.println(s2.charAt(0));

        // Array split
        System.out.println("Resulting array after splitting it by space");
        String s2Arr[] = s2.split(" ");
        for(i=0;i<s2Arr.length;i++) {
            System.out.println(s2Arr[i]);
        }
    }
}
