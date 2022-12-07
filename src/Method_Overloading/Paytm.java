package Method_Overloading;

public class Paytm {
    static void pay(int Num){
        System.out.println("Paying by "+ Num);
    }
    static void pay(String Name){
        System.out.println("Paying by " +Name );
    }
    static void pay(int Num, String Name){
        System.out.println("Paying by "+Num+"and "+Name);
    }
    static void pay(String Name, int Num){
        System.out.println("Paying by "+Name+"and "+Num);
    }
}
class main2{
    public static void main(String[] args){
        Paytm.pay(700125142);
        Paytm.pay("Avijit");
        Paytm.pay(504875948,"Rahul");
        Paytm.pay("Amit", 1085276621);
    }
}


