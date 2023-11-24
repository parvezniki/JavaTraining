public class StringsEx1 {
    public static void main (String []args) {

        String str1 = "Humpty Dumpty sat on a wall";
        System.out.println("Length of the string is: "+str1.length()); // finding out the length

        System.out.println("Finding sat in the string: "+str1.contains("sit"));

        if(str1.contains("sit")) System.out.println("sat -> sub string is found ");
        else  System.out.println("sat -> sub string is NOT found ");


        String str2 = "APPLE";
        char ch1 = str2.charAt(3);
        System.out.println(ch1);


        String str3 = "PINEAPPLE";
        char ch2;

        for(int i=str3.length()-1;i>=0;i--) {
            ch2 = str3.charAt(i);
            System.out.println(ch2);
        }
    }
}
