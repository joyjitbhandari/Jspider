package Method_overriding;

public class Telegram_v1 {
    void send(){
        System.out.println("Only text message");
    }
}
class Telegram_v2 extends Telegram_v1 {
    void send(){
        System.out.println("along with text message , photo , video");
    }
}
class MainClass1{
    public static void main(String[] args){
        Telegram_v2 v2= new Telegram_v2();
        v2.send();
    }
}
