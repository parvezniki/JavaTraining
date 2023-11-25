public class StringProg2 {
    public static void main(String []args) {
        int i;
        String csvData = "1,jack,50,60,80,74\n" +
                "2,john,45,87,98,77\n" +
                "3,raj,74,85,97,66\n" +
                "4,pavan,25,65,87,88";

        String arr1[] = csvData.split("\n");
        for(i=0;i<arr1.length;i++) {
            String arr2[] = arr1[i].split(",");
            System.out.println("Roll Number : "+arr2[0]);
            System.out.println("Name : "+arr2[1]);
            System.out.println("M1 : "+arr2[2]);
            System.out.println("M2 : "+arr2[3]);
            System.out.println("M3 : "+arr2[4]);
            System.out.println("M4 : "+arr2[5]);
        }
        /*
        Intended Output:
                RollNumber : 1
                Name       : jack
                M1         : 50
                M2          : 60
                M3          :80
                M4          : 74

         */
    }
}
