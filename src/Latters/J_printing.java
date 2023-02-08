package Latters;

public class J_printing {
    public static void main(String[] args) {
        int n=7;
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=n; j++){
                if(i==1 || j==n ){
                    if(i<n || j<n-1){
                    System.out.print("J ");
                    }else {
                        System.out.print("  ");
                    }
                }else if(i==n){
                    if(j == 1){
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("J ");
                    }
                } else if(i==n-1 || i==n-2){
                   if (j==2){
                       System.out.print("J ");
                   }else {
                       System.out.print("  ");
                   }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

