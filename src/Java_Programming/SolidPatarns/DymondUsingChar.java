package Java_Programming.SolidPatarns;

public class DymondUsingChar {
    public static void main(String[] args) {
        int n=7,count=1,space=3; char ch ='A' ;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=count; k++){
                System.out.print(ch);
                ch++;
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
