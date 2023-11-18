/*
				spaces=4;spaces>=0;spaces--	  stars=2;stars<=10;stars+=2

				for(spaces=4,stars=2;spaces>=0 && stars<=10;spaces--,stars+=2)

				<spaces> <stars>
        * *			4spaces, 2stars 	forLoop->spaces, forLoop->stars  \n
      * * * * 			3spaces, 4stars
    * * * * * *			2spaces, 6stars
  * * * * * * * *		1space , 8stars
* * * * * * * * * *		0space , 10stars


				spaces=0;spaces<=4;spaces++	  stars=10;stars>=2;stars-=2
				for(spaces=0,stars=10;spaces<=4 && stars>=2;spaces++,stars-=2)

* * * * * * * * * *		0space , 10stars	forLoop->spaces, forLoop->stars  \n
  * * * * * * * *		1space , 8stars
    * * * * * *			2spaces, 6stars
      * * * * 			3spaces, 4stars
        * *			4spaces, 2stars

 */
public class StarsProgram2 {
    public static void main(String []args) {
        int spaces,stars;
        int i;
        for(spaces=4,stars=2;spaces>=0 && stars<=10;spaces--,stars+=2) {
            for (i = 1; i <= spaces; i++) System.out.print("  ");
            for (i = 1; i <= stars; i++) System.out.print(" *");
            System.out.println();
        }
        for(spaces=0,stars=10;spaces<=4 && stars>=2;spaces++,stars-=2) {
            for (i = 1; i <= spaces; i++) System.out.print("  ");
            for (i = 1; i <= stars; i++) System.out.print(" *");
            System.out.println();
        }
    }
}
