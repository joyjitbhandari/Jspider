package Latters;

public class G_printing {
    public static void main(String[] args) {
        int n=7;
        for(int i=1; i<=n;i++){
            if(i==1 || i==n){
                System.out.print("  ");
            }
            else {
                System.out.print("G ");
            }
            for(int j=1; j<=n-1; j++){
                if(i<n/2+1){
                    if(i==1)
                    System.out.print("G ");
                }else{
                    if(i==n||j==n-1){
                        System.out.print("G ");
                    }else if(j==n-2 && i== n/2+1 || j==n-3 && i==n/2+1 ){
                        System.out.print("G ");
                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("  ");
        }
    }
}
