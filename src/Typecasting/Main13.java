package Typecasting;
class hahuhu{
    void disp(){
        System.out.println("Disp");
    }
}
class cool4 extends hahuhu{
    int r =560;
    void co(){
        System.out.println("co");
    }

}
public class Main13 {
    public static void main(String[] args) {
        hahuhu h = new cool4();
        h.disp();
        cool4 c = (cool4) h;
        c.co();
        c.disp();
        System.out.println(c.r);
    }
}
