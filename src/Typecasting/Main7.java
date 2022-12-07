package Typecasting;
class chungacha{
    int d =100;
}
class cola1 extends chungacha{
    int f = 500;
}
public class Main7 {
    public static void main(String[] args) {
        chungacha c = new cola1();
        System.out.println(c.d);
        cola1 co = (cola1) c;
        System.out.println(co.d);
        System.out.println(co.d+co.f);
    }
}
