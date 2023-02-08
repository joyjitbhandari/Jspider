package Latters;

public class F_printing {
    public static void main(String[] args) {
        int n=7;
        for(int i=1; i<=n;i++){
            if(i==1){
                System.out.print("  ");
            }
            else {
                System.out.print("F ");
            }
            for(int j=1; j<=n-1; j++){
                if(i==1 || i==n/2+1 ){
                    System.out.print("F ");
                }
            }
            System.out.println("  ");
        }
    }
}
