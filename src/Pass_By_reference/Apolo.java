package Pass_By_reference;

public class Apolo {
    void medicine(){
        System.out.println("Prescription");
    }
}
class MediPluse{
    public static void main(String[] args){
        Apolo A = new Apolo();
        Customer5.needMed(A);
    }
}
class Customer5 {
    static void needMed(Apolo A1){
        A1.medicine();
    }
}
