package Typecasting;
class huliyacha{
    void ho(){
        System.out.println("hoho");
    }
}
class tester1 extends huliyacha{
    int x =50;
    void disp(){
        System.out.println("disp");
    }
}
public class Main8 {
    public static void main(String[] args) {
        huliyacha h = new tester1();
        h.ho();
        tester1 t = (tester1) h;
        t.disp();
        System.out.println(t.x);
    }
}
