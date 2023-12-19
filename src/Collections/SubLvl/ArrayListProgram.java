package Collections.SubLvl;

import java.util.ArrayList;

public class ArrayListProgram {
    public static void main(String []args) {
        int i;
        int a1[] = new int[10];
        for(i=1; i<=10;i++) {
            a1[i-1] = i*10;
        }

        for(i=0; i<10;i++) {
            System.out.print(a1[i]+",");
        } System.out.println();
System.out.println("--------------------------------------------------");
        ArrayList<Integer> a2 = new ArrayList<Integer>();           // <P extend> <?>      -> Java Generics
        for(i=1; i<=10;i++) {
            a2.add(i*10);
        }

        System.out.println(a2);
    }
}
