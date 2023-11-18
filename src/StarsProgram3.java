/*
n = 10
				spaces=4;spaces>=0;spaces--	  stars=2;stars<=10;stars+=2

				for(spaces=(n/2) - 1,stars=2;spaces>=0 && stars<=n;spaces--,stars+=2)
				n/2 - 1,
				<spaces> <stars>
        * *			4spaces, 2stars 	forLoop->spaces, forLoop->stars  \n
      * * * * 			3spaces, 4stars
    * * * * * *			2spaces, 6stars
  * * * * * * * *		1space , 8stars
* * * * * * * * * *		0space , 10stars  [n]


				spaces=0;spaces<=4;spaces++	  stars=10;stars>=2;stars-=2
				for(spaces=0,stars=n;spaces<=(n/2) - 1 && stars>=2;spaces++,stars-=2)

* * * * * * * * * *		0space , 10stars [n]	forLoop->spaces, forLoop->stars  \n
  * * * * * * * *		1space , 8stars
    * * * * * *			2spaces, 6stars
      * * * * 			3spaces, 4stars
        * *			4spaces, 2stars
				n/2 - 1

 */
public class StarsProgram3 {
    public static void main(String []args) {
        int spaces,stars;
        int i,n;
        n = 20;
        for(spaces=(n/2)-1,stars=2;spaces>=0 && stars<=n;spaces--,stars+=2) {
            for (i = 1; i <= spaces; i++) System.out.print("  ");
            for (i = 1; i <= stars; i++) System.out.print(" *");
            System.out.println();
        }
        for(spaces=0,stars=n;spaces<=(n/2)-1 && stars>=2;spaces++,stars-=2) {
            for (i = 1; i <= spaces; i++) System.out.print("  ");
            for (i = 1; i <= stars; i++) System.out.print(" *");
            System.out.println();
        }
    }
}
