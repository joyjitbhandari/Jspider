package Latters;

public class H_printing {
    public static void main(String[] args) {
        int n=7;
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=n; j++){
                if(j==1 || j==n ){
                    System.out.print("H ");
                }else if(i==n/2+1) {
                    System.out.print("H ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

