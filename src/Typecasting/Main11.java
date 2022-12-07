package Typecasting;
class golata2{
    void add(){
        System.out.println(10+52);
    }
}
class sample21 extends golata2{
    int r =56;
    void disp(){
        System.out.println("Disp");
    }
}
public class Main11 {
    public static void main(String[] args) {
       golata2 g = new sample21();
       g.add();
       sample21 c = (sample21) g;
       c.disp();c.add();
        System.out.println(c.r);
    }
}
