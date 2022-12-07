package Java_Concepts_Assignment;

public class Assignment17 {
    public static void main(String[] args){
        integer_array();
        string_array();
    }

   static void integer_array(){
        int[] integer  = new int[4];
        integer[0] = 10; integer[1] = 20; integer[2] = 30; integer[3] = 40;
        System.out.println ("The integer list is:");
        System.out.println("Index\tItems");
        for(int i=0;i<integer.length;i++){
            System.out.println("\t"+i+"\t" +integer[i]);
        }
    }
    static void string_array() {
        String[] item = new String[4];
        item[0] = "Joy";
        item[1] = "Shanavaz";
        item[2] = "Amith";
        item[3] = "karishma";
        System.out.println("The Name list is:");
        System.out.println("Index\tItems");
        for (int i = 0; i < item.length; i++) {
            System.out.println("\t"+i+"\t" + item[i]);
        }
    }

}
