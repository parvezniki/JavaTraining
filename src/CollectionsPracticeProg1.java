import java.util.*;

public class CollectionsPracticeProg1 {
    public static void main(String args[]) {
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Apple"); //0
        arrayList1.add("Ball"); //1
        arrayList1.add("Cat"); //2
        arrayList1.add("Dog");
        arrayList1.add("Elephant");

        // Print all elements of Array List
        System.out.println(arrayList1); // 1 way to print the entire list
        System.out.println(arrayList1.get(2));

        for(int i=0;i<arrayList1.size();i++) {  // 2 way to print the entire list using for loop
            System.out.print(arrayList1.get(i)+",");
        } System.out.println();

        for(String val:arrayList1) {  // 3 way to print the entire list using for Each
            System.out.print(val+",");
        } System.out.println();

        Iterator iter1 = arrayList1.iterator(); // 3 way to print the entire list using for Each
        while(iter1.hasNext()) {
            System.out.print(iter1.next()+",");
        } System.out.println();


       /* List<String> linkedList1  = new LinkedList<>();
        linkedList1.add("Apple");
        linkedList1.add("Ball");
        linkedList1.add("Cat");
        linkedList1.add("Dog");
        linkedList1.add("Elephant");

        // Print all elements of Linked List
        System.out.println(linkedList1);
        System.out.println(linkedList1.get(2));


        Set<String> setExp1 = new LinkedHashSet<>();

        setExp1.add("Apple"); //0
        setExp1.add("Ball"); //1
        setExp1.add("Cat"); //2
        setExp1.add("Dog");
        setExp1.add("Elephant");
        setExp1.add("Elephant");
        setExp1.add("Cat");
        setExp1.add("Cat");

        // Print all elements of Array List
        System.out.println(setExp1);
        System.out.println(setExp1.size());
        System.out.println(setExp1.contains("Cat"));
        setExp1.remove("Dog");
        System.out.println(setExp1);*/

    }
}
