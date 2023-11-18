/*


1  *
2  * *
3  * * *
4  * * * *
5  * * * * *

*/


public class StarsProgram1 {
    public static void main(String []args) {
        // Embedded loops
        for(int n=1;n<=5;n++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();   //            System.out.print("\n");
        }

        for(int n=5;n>=1;n--) {
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();   //            System.out.print("\n");
        }
    }
}
