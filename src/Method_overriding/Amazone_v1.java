package Method_overriding;
public class Amazone_v1 {
    void order(){
        System.out.println("The product buying");
    }
}
class Amazone_v2 extends Amazone_v1{
    void order(){
        System.out.println("amazone prime live shows");
    }
}
class Mainclass{
    public static void main(String[] args){
        Amazone_v2 v2 = new Amazone_v2();
        v2.order();
    }
}
