package Java_Programming.SolidPatarns;

public class DymondUsingZeroAndOneP1 {
    public static void main(String[] args) {
        int n=7,count=1,space=3;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=count; k++){
                if(k%2==1) {
                    System.out.print("1");
                }else System.out.print("0");
            }

            System.out.println();
            if(i<=n/2){
                count+=2;
                space--;
            }else {
                count-=2;
                space++;
            }
        }
    }
}
