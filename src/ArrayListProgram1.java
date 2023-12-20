import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListProgram1 {
    public static void main(String []args) {
        // Declaration & Inititalization
        String colorsArray[] = {"Orange","Blue","Black","Pink","White","Purple"}; // 6  -  colorsArray.length
        ArrayList<String> colorsArrayList = new ArrayList<>(Arrays.asList("Orange","Blue","Black","Pink","White","Purple") );

        // Access/Read from a specific index
        System.out.println(colorsArray[2]);
        System.out.println(colorsArrayList.get(2));

        // Findout the size of the array & Array List
        System.out.println(colorsArray.length);
        System.out.println(colorsArrayList.size());

        // Replace a value at a given index
        colorsArray[0] = "Yellow";
        colorsArrayList.set(0,"Yellow");
        System.out.println(colorsArray[0]);
        System.out.println(colorsArrayList.get(0));

        // Add an element to the array
        // Arrays: NOT POSSIBLE, becasue the array size is fixed
        colorsArrayList.add(0,"Magenta");
        System.out.println(colorsArray);
        System.out.println(colorsArrayList); // overriddent method called toString() which will help to print the array List

        // Remove an element from the array
        // Arrays: NOT POSSIBLE, becasue the array size is fixed
        colorsArrayList.remove(3);
        System.out.println(colorsArrayList);

        // Remove an element from the array
        // Arrays: NOT POSSIBLE, becasue the array size is fixed
        colorsArrayList.remove("Pink");
        System.out.println(colorsArrayList);

        String colorToFind = "Purple";
        if(colorsArrayList.contains(colorToFind))
            System.out.println("YEs, we have found "+colorToFind+" in the ArrayList");
        else
            System.out.println("No, "+colorToFind+"  is not found");

        System.out.println("Index of Purple is :"+colorsArrayList.indexOf("Purple"));

    }
}
