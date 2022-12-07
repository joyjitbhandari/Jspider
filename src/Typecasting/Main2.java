package Typecasting;

class Ampluse{
    void tata(){
        System.out.println("tata");
    }
}
class Sample extends Ampluse{
    void disp(){
        System.out.println("disp");
    }
}
public class Main2 {
    public static void main(String[] args) {
        System.out.println("*** Up Casting ***");
        Ampluse a = new Sample();
        a.tata();
        System.out.println("*** Down Casting***");
        Sample s = (Sample) a;
        s.disp();
        s.tata();
    }
}
