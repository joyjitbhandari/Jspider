package Typecasting;
class dumaka3{
    int x =50;
}
class demo10 extends dumaka3{
    int r =56;
    double x = 60;
}
public class Main12 {
    public static void main(String[] args) {
        dumaka3 du = new demo10();
        System.out.println(du.x);
        demo10 d = (demo10) du;
        System.out.println(d.r);
        System.out.println(d.x);
        System.out.println(d.x+d.r);
    }
}
