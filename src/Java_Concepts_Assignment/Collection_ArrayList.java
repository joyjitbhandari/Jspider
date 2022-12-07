package Java_Concepts_Assignment;

import java.util.ArrayList;

public class Collection_ArrayList {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(10);l.add(20.56);l.add('A');l.add("Hii");l.add(100);
        System.out.println(l);
        l.add(3,"Name");
        System.out.println(l);

        ArrayList l1 = new ArrayList();
        l1.add(50);l1.add(20);l1.add("hello");
        l.addAll(l1);
        System.out.println(l);
        l.addAll(2,l1);
        System.out.println(l);

        l.remove(1);
        System.out.println(l);

        l.remove("Hii");
        System.out.println(l);

        l.removeAll(l1);
        System.out.println(l);

        for(int i =0; i<l.size();i++){
            if(l.contains(10)){
                System.out.println(l.get(i)+" is Present");
                break;
            }
        }

        ArrayList l2 = new ArrayList();
        l2.add(10);l2.add(100);

        l.retainAll(l2);
        System.out.println(l);
    }
}
