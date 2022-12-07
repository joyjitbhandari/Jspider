package Encapsulation;

class Gmail{
    private String pwd = "joy@123";

    public String getPwd(){

        return pwd;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }

}
public class gmailCustomer {
    public static void main(String[] args) {
        Gmail g = new Gmail();
        System.out.println(g.getPwd());
        g.setPwd("Joy@456");
        System.out.println("new password is : "+g.getPwd());
    }
}
