
public class RajProgramArr1 {
        public static void main(String []args)
        {
            int arr1[] = new int[]{10,20,30,40,20,75,88,40,30};

            for(int i=0;i<arr1.length;i++) {
                for(int j=i+1;j<arr1.length;j++) {
                    if(arr1[i] == arr1[j]) {
                        System.out.println(arr1[j]);
                    }
                }
            }

        }
}
