package Method_overriding;
public class Phone_v1 {
    void call(){
        System.out.println("Only voice call");
    }
}
class Phone_v2 extends Phone_v1 {
    void call(){
        System.out.println("Along with voice call, video call");
    }
}
class MainClass3{
    public static void main(String[] args) {
        Phone_v2 v2 = new Phone_v2();
        v2.call();
    }
}