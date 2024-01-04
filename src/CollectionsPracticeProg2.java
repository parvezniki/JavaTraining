import java.util.*;

public class CollectionsPracticeProg2 {
    public static void main(String args[]) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,1,10,20,30,5,5,6,10));
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(list1);
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>(list1);
        System.out.println(set2);
    }
}
