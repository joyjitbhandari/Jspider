package Typecasting;
class tista1{
    void uliya(){
        System.out.println("uliya");
    }
}
class tester3 extends tista1{
    int r = 47;
    void disp(){
        System.out.println("disp");
    }
}
public class Main10 {
    public static void main(String[] args) {
        tista1 t = new tester3();
        t.uliya();
        tester3 te = (tester3) t;
        te.disp();
        te.uliya();
        System.out.println(te.r);
    }
}
