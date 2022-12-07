package Pass_By_reference;
public class Sbi {
    void amount(){
        System.out.println("Money");
    }
}
class Sbi_Manager{
    public static void main(String[] args){
        Sbi S = new Sbi();
        Customer3.needMoney(S);
    }
}
class Customer3{
    static void needMoney(Sbi S1){
        S1.amount();
    }
}