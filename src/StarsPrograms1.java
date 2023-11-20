/*


*               -> 1 star
* *             -> 2 star
* * *           -> 3 star
* * * *         -> 4 star
* * * * *       -> 5 star


 */
public class StarsPrograms1 {
    public static void main(String []args){
        int i,n=5;

        for(n=1;n<=5;n++) {
            for (i = 1; i <= n; i++) System.out.print("* ");
            System.out.println();
        }

        for(n=5;n>=1;n--) {
            for (i = 1; i <= n; i++) System.out.print("* ");
            System.out.println();
        }

    }
}
