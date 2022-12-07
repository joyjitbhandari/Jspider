package Java_Programming.SolidPatarns;

public class DymondUsingNumberPattern2 {
    public static void main(String[] args) {
        int n = 7 , num = 1, space=3; int count=1;
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=space ; j++ ){
                System.out.print(" ");
            }
            for (int k=1; k<=num; k++){
                System.out.print(count);
            }
            System.out.println();
            if(i<=n/2){
                space--;
                num+=2;
                count++;
            }
            else {
                space++;
                num-=2;
                count--;
            }
        }
    }
}
