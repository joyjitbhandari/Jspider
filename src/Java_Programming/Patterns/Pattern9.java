package Java_Programming.Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j =5; j>=1; j--){
                if(i>=j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=4 ;i>=1; i--){
            for(int j =5; j>=1; j--){
                if(i>=j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
