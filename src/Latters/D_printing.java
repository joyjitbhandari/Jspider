package Latters;

public class D_printing {
    public static void main(String[] args) {
        int n = 7 ;
        for(int i =1; i<=n;i++){
            if(i==1 || i==n){
                for(int j=1; j<=n-1;j++) {
                    System.out.print("D ");
                }
            }else {
                for(int j=1; j<=n;j++) {
                    if (j == 1 || j==n) {
                        System.out.print("D ");
                    } else System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
