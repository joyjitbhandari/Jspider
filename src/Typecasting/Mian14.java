package Typecasting;
class chungacha1{
    int d = 200;
}
class cola13 extends chungacha1{
    int f = 30;
    void disp(){
        System.out.println("disp");
    }

}
public class Mian14 {
    public static void main(String[] args) {
        chungacha1 ch = new cola13();
        System.out.println(ch.d);
        cola13 c = (cola13) ch;
        System.out.println(c.d);
        System.out.println(c.d+c.f);
    }
}
