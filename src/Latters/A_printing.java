package Latters;

public class A_printing {
    public static void main(String[] args) {
        int n = 7 ;
        for(int i =1; i<=n;i++){
            if(i==1 || i==n/2+1){
                if(i==1){
                    System.out.print("  ");
                    for (int j = 1; j <= n-2; j++) {
                        System.out.print("A ");
                    }
                }else {
                    for (int j = 1; j <= n; j++) {
                        System.out.print("A ");
                    }
                }
            }else {
                for(int j=1; j<=n;j++) {
                    if (j == 1 || j == n) {
                        System.out.print("A ");
                    } else System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
