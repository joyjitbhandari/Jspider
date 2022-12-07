package Typecasting;
class Tista{
    void uliya(){
        System.out.println("uliya");
    }
}
class Tester extends Tista{
    int r = 10;
}
public class Main3 {
    public static void main(String[] args) {
        Tista T = new Tester();
        T.uliya();
        Tester Te = (Tester) T;
        System.out.println(Te.r);
        Te.uliya();
    }
}
