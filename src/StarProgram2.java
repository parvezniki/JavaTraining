/*
			for(stars=1,spaces=4; stars<=9 && spaces>=0 ; stars+=2,spaces-- )
			-> stars +=2	space --1
        *\n		    1		4	[  (n-1)/2 ]
      * * *\n		    3		3
    * * * * *\n		    5		2
  * * * * * * *\n	    7		1
* * * * * * * * *\n	    9 [n]	0

			for(stars=9,spaces=0;stars>=1 && spaces<=4;stars-=2,spaces++)
			-> stars -=2	space ++1
* * * * * * * * *	    9 [n]	0
  * * * * * * *		    7		1
    * * * * *		    5		2
      * * *		    3		3
        *		    1		4	[  (n-1)/2 ]
 */
public class StarProgram2 {
    public static void main(String []args) {
        int i, stars = 5,spaces=5;

        for(stars=1,spaces=4; stars<=9 && spaces>=0 ; stars+=2,spaces-- ) {
            for (i = 1; i <= spaces; i++) System.out.print("  ");
            for (i = 1; i <= stars; i++) System.out.print("* ");
            System.out.println(); // System.out.print("\n");
        }
        for(stars=9,spaces=0;stars>=1 && spaces<=4;stars-=2,spaces++) {
            for (i = 1; i <= spaces; i++) System.out.print("  ");
            for (i = 1; i <= stars; i++) System.out.print("* ");
            System.out.println(); // System.out.print("\n");
        }

    }
}
