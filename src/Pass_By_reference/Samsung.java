package Pass_By_reference;
public class Samsung {
    void porduct(){
    System.out.println("Post");
}
}
class Store{
    public static void main (String[] args){
        Samsung S = new Samsung();
        Customer1.needProduct(S);
    }
}
class Customer1{
    static void needProduct( Samsung S1){
        S1.porduct();
    }
}