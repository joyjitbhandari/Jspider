package Java_Programming.ArraysOpertion;
public class SumArray {
    public static void main(String[] args) {
        int[] arr = {121,146,721,348};
        for(int i =0; i<arr.length; i++){
            int sum = 0; int no = arr[i];
            while(no!=0){
                int rem = no%10;
                sum = sum+rem;
                no=no/10;
            }
            System.out.print(sum+" ");
        }
    }
}

