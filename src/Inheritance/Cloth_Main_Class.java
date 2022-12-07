package Inheritance;

interface Cloth{
    void Design();
}
class shirt implements Cloth{
    public void Design(){
        System.out.println("Shirt");
    }
}
class t_shirt implements Cloth{
    public void Design(){
        System.out.println("T-Shirt");
    }
}
class pant implements Cloth{
    public void Design(){
        System.out.println("Pant");
    }
}
class Industry{
    static void manufacture(Cloth m){
        m.Design();
    }
}
public class Cloth_Main_Class {
    public static void main(String[] args) {
        shirt s = new shirt();
        t_shirt t = new t_shirt();
        pant p = new pant();
        Industry.manufacture(s);
        Industry.manufacture(t);
        Industry.manufacture(p);
    }

}
