package Java_Programming;

public class CheakSameNum {
    public static void main(String[] args) {
        System.out.println(check(9,10));
        System.out.println(check(9,9));
        System.out.println(check(1,9));
    }
    static boolean check(int a , int b){
        if(a+b==10|| a==10|| b==10){
            return true;
        }else {return false;}
    }
}
