package Method_Overloading;

import java.lang.annotation.Target;

public class TeaShop {
    static void order(int cost){
        System.out.println("Tea Ordered  by "+ cost+"rs");
    }
    static void order(String Type){
        System.out.println("Tea Ordered  by " +Type );
    }
    static void order(int cost, String Type){
        System.out.println("Tea Ordered  by "+cost+"rs and "+Type);
    }
    static void order(String Type, int cost){
        System.out.println("Tea Ordered  by "+Type+"and "+cost+"rs");
    }
}
class main5 {
    public static void main(String[] args){
        TeaShop.order(10);
        TeaShop.order("Milk Tea");
        TeaShop.order(30,"Masala Tea");
        TeaShop.order("Malai Tea", 20);
    }
}
