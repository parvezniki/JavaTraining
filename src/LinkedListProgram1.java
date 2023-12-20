import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListProgram1 {
    public static void main(String []args) {
        // Declaration & Inititalization
        String colorsArray[] = {"Orange","Blue","Black","Pink","White","Purple"}; // 6  -  colorsArray.length
        LinkedList<String> colorsLinkedList = new LinkedList<>(Arrays.asList("Orange","Blue","Black","Pink","White","Purple") );

        // Access/Read from a specific index
        System.out.println(colorsArray[2]);
        System.out.println(colorsLinkedList.get(2));

        // Findout the size of the array & Array List
        System.out.println(colorsArray.length);
        System.out.println(colorsLinkedList.size());

        // Replace a value at a given index
        colorsArray[0] = "Yellow";
        colorsLinkedList.set(0,"Yellow");
        System.out.println(colorsArray[0]);
        System.out.println(colorsLinkedList.get(0));

        // Add an element to the array
        // Arrays: NOT POSSIBLE, becasue the array size is fixed
        colorsLinkedList.add(0,"Magenta");
        System.out.println(colorsArray);
        System.out.println(colorsLinkedList); // overriddent method called toString() which will help to print the array List

        // Remove an element from the array
        // Arrays: NOT POSSIBLE, becasue the array size is fixed
        colorsLinkedList.remove(3);
        System.out.println(colorsLinkedList);

        // Remove an element from the array
        // Arrays: NOT POSSIBLE, becasue the array size is fixed
        colorsLinkedList.remove("Pink");
        System.out.println(colorsLinkedList);

        String colorToFind = "Purple";
        if(colorsLinkedList.contains(colorToFind))
            System.out.println("YEs, we have found "+colorToFind+" in the LinkedList");
        else
            System.out.println("No, "+colorToFind+"  is not found");

        System.out.println("Index of Purple is :"+colorsLinkedList.indexOf("Purple"));
    }
}
