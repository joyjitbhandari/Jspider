package Typecasting;
class golata{
    void disp(){
        System.out.println("disp");
    }
}
class cool extends golata{
    void add(){
        System.out.println(10+85);
    }
}
public class Main4 {
    public static void main(String[] args) {
        golata g = new cool();
        g.disp();
        cool c = (cool) g;
        c.add();
        c.disp();
    }
}
