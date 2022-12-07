package Typecasting;
class pemocha{
    void ho(){
        System.out.println("hiii");
    }
}
class demo extends pemocha{
    int x = 10;
}
public class Main1{
    public static void main(String[] args) {
         pemocha p = new demo();
         p.ho();
         demo d = (demo) p;
         d.ho();
        System.out.println(d.x);
    }
}
