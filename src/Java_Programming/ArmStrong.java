package Java_Programming;

public class ArmStrong {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0; int n = 0; int copy=num;
        for(;copy!=0;copy/=10,++n){
            copy = num;
            for(;copy!=0; copy/=10){
                int rem = copy %10;
                sum+=Math.pow(rem,n);
            }
            if(sum == num){
                System.out.println(num+" Is a armStrong number");
            }else {
                System.out.println(num+" Is not a armStrong number");
            }
        }
    }
}
