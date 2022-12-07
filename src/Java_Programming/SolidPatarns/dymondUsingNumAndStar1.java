package Java_Programming.SolidPatarns;

public class dymondUsingNumAndStar1 {
    public static void main(String[] args) {
        int n = 7 , star = 1, space=n/2;
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=space ; j++ ){
                System.out.print(" ");
            }
            for (int k=1; k<=star; k++){
                if(i<=n/2){
                    System.out.print(k);
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
