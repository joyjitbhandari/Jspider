package Typecasting;
class guleyuu{
    void disp(){
        System.out.println("Disp");
    }
}
class sample2 extends guleyuu{
    void co(){
        System.out.println("Co");
    }
}
public class Main6 {
    public static void main(String[] args) {
        guleyuu g = new sample2();
        g.disp();
        sample2 s = (sample2) g;
        s.co();
        s.disp();
    }
}
