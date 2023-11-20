public class StarProgram5 {
    public static void main(String []args) {
        int spaces,nums,val=0,x=0,i,flip=0;

        for(spaces=4,nums=1,val=1; spaces>=0 && nums<=9; spaces--,nums+=2,val++)
        {
            for(i=1;i<=spaces;i++) System.out.print("  ");
            flip=0;
            for(i=1,x=val;i<=nums;i++) {
                System.out.print(x+" ");
                if(flip==0) x--;
                else x++;

                if(x<1) { flip=1; x+=2; }

            }
            System.out.println();
        }
    }

}
