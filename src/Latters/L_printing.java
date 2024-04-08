package Latters;

public class L_printing {
    public static void main(String[] args) {
        int n=7;
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=n; j++){
                if(j==1) {
                    System.out.print("L ");
                }else if(i==n){
                    System.out.print("L ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

