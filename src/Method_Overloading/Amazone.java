package Method_Overloading;
public class Amazone {
    static void order(int Qua){
        System.out.println("Ordered by "+ Qua);
    }
    static void order(String Type){
        System.out.println("Ordered by " +Type );
    }
    static void order(int Qua, String Type){
        System.out.println("Ordered by "+Qua+"and "+Type);
    }
    static void order(String Type, int Qua){
        System.out.println("Ordered by "+Type+"and "+Qua);
    }
}
class mai4{
    public static void main(String[] args){
        Amazone.order(4);
        Amazone.order("Shirt");
        Amazone.order(5,"Pant");
        Amazone.order("Blazer",4);
    }
}