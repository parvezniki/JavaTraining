import java.util.*;

public class VectorSampleProg {
    public static void main(String args[])
    {
        samplePrintMethod();
        List<String> arrayList1 = Collections.synchronizedList(new ArrayList<>());
        arrayList1.add("Apple");
        arrayList1.add("Ball");
        arrayList1.add("Cat");
        System.out.println(arrayList1);

        samplePrintMethod();

        List<String> vectorList1 = new Vector<>();
        vectorList1.add("Apple");
        vectorList1.add("Ball");
        vectorList1.add("Cat");
        System.out.println(vectorList1);

        samplePrintMethod();

        System.out.println("End of Program");
    }

    static void samplePrintMethod() {
        System.out.println("I'm a sample method");
    }
}
