package Latters;

public class I_printing {
    public static void main(String[] args) {
        int n=7;
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n ){
                    System.out.print("I ");
                }else if(j==n/2+1) {
                    System.out.print("I ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

