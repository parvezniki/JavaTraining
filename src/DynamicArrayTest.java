public class DynamicArrayTest {
    public static void main(String []args) {
        DynamicArray dar = new DynamicArray();
        dar.add("Red");
        dar.add("Orangle");
        dar.add("Blue");
        dar.add("Black");
        dar.add("Pink");
        dar.add("Red");
        dar.add("Orangle");
        dar.add("Blue");
        dar.add("Blue1");
        dar.add("Blue1");
        dar.add("Blue1");
        dar.add("Blue1");
        dar.add("Blue1");
        dar.add("NewCOlor");

        System.out.println("Size: " +dar.size());
        System.out.println(dar);
        System.out.println("Capacity:"+dar.capacity());
        System.out.println("Percent Occupied:"+dar.percentOccupied()+"%");
    }
}
