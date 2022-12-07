package Java_Programming.SolidPatarns;

public class SymbolPattern1 {
    public static void main(String[] args) {
        int n = 7, num = n, space = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= num; k++) {
                if (k%2==0){
                    System.out.print("^");
                }else System.out.print("%");
            }
            System.out.println();
            if (i<=n/2){
                space++;
                num-=2;
            }else {
                space--;
                num+=2;
            }
        }
    }
}
