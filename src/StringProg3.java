public class StringProg3 {
    public static void main(String []args) {
        String s1 = "This is a sample string sample value";

        System.out.println("index of char s is :"+s1.indexOf('s'));
        System.out.println("index of char X is :"+s1.indexOf('X')); // X is not found in the string s1, so it will return -1
        System.out.println("index of string sample is :"+s1.indexOf("sample"));
        System.out.println("from last index of char s is :"+s1.lastIndexOf('s'));
        System.out.println("from last index of string sample is :"+s1.lastIndexOf("sample"));
        System.out.println("index of char s from 4th index is :"+s1.indexOf('s',4));

    }
}
