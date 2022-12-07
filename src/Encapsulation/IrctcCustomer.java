package Encapsulation;

import Method_Overloading.Irctc;

class Irctc1{
    private String userId = "Joy1504";
    public String getuser(){
        return userId;
    }
    public void setuser(String userId){
        this.userId = userId;
    }
}
public class IrctcCustomer {
    public static void main(String[] args) {
        Irctc1 i = new Irctc1();
        System.out.println(i.getuser());
        i.setuser("Joyjit");
        System.out.println("New Password : "+i.getuser());
    }
}
