package Java_Concepts_Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionSets {
    public static void main(String[] args) {
        HashSet l1 =  new HashSet();
        l1.add(10);l1.add(20.56);l1.add('A');l1.add("Hii");
        System.out.println(l1);
        HashSet l2 =  new HashSet();
        l1.add('H');l1.add("Hello");
        l1.addAll(l2);
        System.out.println(l1);
        l1.remove(10);
        System.out.println(l1);

        LinkedHashSet l3 = new LinkedHashSet<>();
    }
}
