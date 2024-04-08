package Latters;

public class K_printing {
    public static void main(String[] args) {
        int n=7;
        float mid = n/2+1;
        float count = mid;
        float count2 = 2;
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=n; j++){
                if(j==1) {
                    System.out.print("K ");
                }else if((i==1 || i==n ) && j>mid){
                    System.out.print("K ");
                } else {
                    if(i< mid){
                        if(j == count){
                            count -- ;
                            System.out.print("K ");
                        }else {
                            System.out.print("  ");
                        }
                    }else{
                        if(j== count2){
                            System.out.print("K ");
                        }else {
                            System.out.print("  ");
                        }
                    }
                }
            }
            if(i>mid){
                count2++;
            }
            System.out.println();
        }
    }
}

