package Java_Programming;

public class PerfectNum {
    public static void main(String[] args) {
        int no = 28;
        int sum = 0;
        for(int i =1; i<=no/2; i++){
            if(no%i==0){
                sum = sum+i;
            }
        }
        if(sum == no){
            System.out.println(no+" Is a perfect number");
        }else {
            System.out.println(no+" Is not a perfect number");
        }
    }
}
