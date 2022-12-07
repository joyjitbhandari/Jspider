package Java_Programming.SolidPatarns;

public class StarPattern1 {
    public static void main(String[] args) {
        int n=7; int num=1; int space=n-2;
        for(int i=1; i<=n ; i++){
            for (int j=1; j<=num; j++){
                System.out.print("* ");
            }
            for(int k =1; k<=space; k++){
                System.out.print("  ");
            }
            for (int j=1; j<=num; j++){
                if(j<=n/2) {
                    System.out.print("* ");
                }
            }
            System.out.println();
            if(i<=n/2){
                num++;
                space-=2;
            }else {
                num--;
                space+=2;
            }
        }
    }
}
