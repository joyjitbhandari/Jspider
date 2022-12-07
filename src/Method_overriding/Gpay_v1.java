package Method_overriding;

public class Gpay_v1 {
    void pay(){
        System.out.println("pay with bank acc no");
    }
}
class Gpay_v2 extends Gpay_v1 {
    void pay(){
        System.out.println("pay with bank acc no, phone no, upi id");
    }
}
class MainClass2{
    public static void main(String[] args){
        Gpay_v2 v2 = new Gpay_v2();
        v2.pay();
    }
}