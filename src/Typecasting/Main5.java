package Typecasting;
class dumtaka{
    int x =50;
}
class demo1 extends dumtaka{
   double f = 20.50d;
}
public class Main5 {
    public static void main(String[] args) {
        dumtaka d = new demo1();
        System.out.println(d.x);
        demo1 de = (demo1) d;
        System.out.println(de.f);
        System.out.println(de.x+de.f);
    }
}
