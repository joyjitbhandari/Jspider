package Java_Programming.SolidPatarns;

public class dymondUsingNumAndStar2 {
    public static void main(String[] args) {
        int n = 7 , star = 1, space=n/2 ;
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=space ; j++ ){
                System.out.print(" ");
            }
            int num=1;
            for (int k=1; k<=star; k++){
                if(k%2==1){
                    System.out.print(num);
                    num++;
                }
                else System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
                space--;
                star+=2;
            }
            else {
                space++;
                star-=2;
            }
        }
    }
}
