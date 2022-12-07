package Method_Overloading;

public class Library {
    static void book(int Num){
        System.out.println("Book search by "+ Num);
    }
    static void book(String Name){
        System.out.println("Book search by " +Name );
    }
    static void book(int Num, String Name){
        System.out.println("Book search by "+Num+"and "+Name);
    }
    static void book(String Name, int Num){
        System.out.println("Book search by "+Name+"and "+Num);
    }
}
class main1{
    public static void main(String[] args){
        Library.book(1052);
        Library.book("Getaanjali");
        Library.book(15285,"Haripoter");
        Library.book("Biology",5280);
    }
}

