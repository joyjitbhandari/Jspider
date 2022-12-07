package Java_Programming.SolidPatarns;

public class TriangleUsingStarAndNum {
    public static void main(String[] args) {
        int n =7 , num=1, space=n/2;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for (int k=1;k<=num;k++){
                if (i%2==1){
                    System.out.print("*");
                }else System.out.print(k);
            }
            System.out.println();
            if(i<=n/2){
                space--;
                num+=2;
            }else break;
        }
    }
}
