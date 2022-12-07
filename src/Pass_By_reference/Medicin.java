package Pass_By_reference;
public class Medicin {
    void product(){
        System.out.println("Tablets");
    }
}
class Pherma{
    public static void main(String[] args){
        Medicin m = new Medicin();
        Customer2.needMed(m);
    }
}
class Customer2{
    static void needMed(Medicin M){
        M.product();
    }
}
