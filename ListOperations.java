//Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
//and a LinkedList to perform the following operations with different functions directed as
//follows
//1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
//Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
//size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list

package advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListOperations {

    public static void main(String[] args) {
        // 1. Creating ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Initial ArrayList: " + arrayList);
        System.out.println("Initial LinkedList: " + linkedList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");
        System.out.println("\nAfter adding 'Mango' at index 1:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Pineapple", "Grapes");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);
        System.out.println("\nAfter adding multiple elements:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 4. Accessing elements
        System.out.println("\nAccess element at index 2:");
        System.out.println("ArrayList: " + arrayList.get(2));
        System.out.println("LinkedList: " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(2, "Kiwi");
        linkedList.set(2, "Kiwi");
        System.out.println("\nAfter updating index 2 to 'Kiwi':");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");
        System.out.println("\nAfter removing 'Banana':");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 7. Searching elements
        System.out.println("\nSearching for 'Orange':");
        System.out.println("ArrayList contains 'Orange'? " + arrayList.contains("Orange"));
        System.out.println("LinkedList contains 'Orange'? " + linkedList.contains("Orange"));

        // 8. List all elements
        System.out.println("\nFinal ArrayList: " + arrayList);
        System.out.println("Final LinkedList: " + linkedList);
    }
}
