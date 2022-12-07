package Java_Programming;

public class CheckNumSameDouble {
    public static void main(String[] args) {
        System.out.println(check(1,2));
        System.out.println(check(3,2));
        System.out.println(check(2,2));
    }
    static int check(int a, int b){
        if(a==b){
            return 2*(a+b);
        }else {
            return a+b;
        }
    }
}
