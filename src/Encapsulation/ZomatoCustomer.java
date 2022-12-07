package Encapsulation;
class Zomato{
    private int pwd = 1504;
    public int getPwd(){
        return pwd;
    }
    public void setPwd(int pwd){
        this.pwd = pwd;
    }

}
public class ZomatoCustomer {
    public static void main(String[] args) {
        Zomato z = new Zomato();
        System.out.println(z.getPwd());
        z.setPwd(25583);
        System.out.println("New Password : "+z.getPwd());
    }
}
