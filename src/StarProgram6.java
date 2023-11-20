public class StarProgram6 {
    public static void main(String []args) {
        int spaces,nums,val=0,x=0,i;
        boolean flip=true;
        int n=9;
        for(spaces=(n-1)/2,nums=1,val=1; spaces>=0 && nums<=n; spaces--,nums+=2,val++)
        {
            for(i=1;i<=spaces;i++) System.out.print("  ");
            flip=true;
            for(i=1,x=val;i<=nums;i++) {
                System.out.print(x+" ");
                if(flip==true) x--;
                else x++;

                if(x<1) { flip=false; x+=2; }

            }
            System.out.println();
        }
    }
}
