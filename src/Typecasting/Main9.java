package Typecasting;
class dinga{
    void tata(){
        System.out.println("tata");
    }
    int x = 400;
}
class cool2 extends dinga{
    void disp(){
        System.out.println("disp");
    }
}
public class Main9 {
    public static void main(String[] args) {
        dinga d = new cool2();
        System.out.println(d.x);
        d.tata();
        cool2 c = (cool2) d;
        c.disp();
        c.disp();
        System.out.println(c.x);
    }
}
