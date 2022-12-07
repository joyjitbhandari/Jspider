package Java_Programming.ArraysOpertion;

public class FactOfIndiNumArr {
    public static void main(String[] args) {
        int[] arr = {121,146,421};
        for(int i = 0; i<arr.length; i++){
            int no =arr[i];
            while (no!=0){
                int fact = 1 ;
                int rem = no%10;
                for(int j = 1; j<=rem; j++){
                    fact = fact *j;
                }
                no = no/10;
                System.out.print(fact+" ");
            }
            System.out.println();
        }
    }
}
