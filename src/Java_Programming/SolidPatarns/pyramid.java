package Java_Programming.SolidPatarns;

public class pyramid {
    public static void main(String[] args) {
        int n=7,star=1,space=3;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=star; k++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
                star+=2;
                space--;
            }else break;
        }
    }
}
