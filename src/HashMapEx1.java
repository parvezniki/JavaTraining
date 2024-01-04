import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String args[]) {
        Map<String,Integer> map1 = new LinkedHashMap<>();
        map1.put("Raj",343);
        map1.put("Ramesh",234);
        map1.put("Kamal",123);
        map1.put("Satosh",555);


        System.out.println(map1);
        System.out.println(map1.size());
        System.out.println(map1.get("Kamal"));
        System.out.println(map1.containsKey("Parvez"));
        map1.put("Satosh",999);
        System.out.println(map1);

        map1.put("Parvez",000);
        System.out.println(map1);



    }
}
