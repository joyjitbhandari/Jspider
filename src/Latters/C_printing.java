package Latters;

public class C_printing {
    public static void main(String[] args) {
        int n = 7 ;
        for(int i =1; i<=n;i++){
            if(i==1 || i==n){
                System.out.print("  ");
                for(int j=1; j<=n;j++) {
                    System.out.print("C ");
                }
            }else {
                for(int j=1; j<=n;j++) {
                    if (j == 1 ) {
                        System.out.print("C ");
                    } else System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
