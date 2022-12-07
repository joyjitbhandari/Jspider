import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int n = 123679;
        int num = n;
        int[] arr = new int[6];
        int[] brr = new int[6];
        int i = 0; int j=0;
        while (num >= 1) {
            int rem = num % 10;
            arr[i] = rem;
            if(num%2==1){
                brr[j] = rem;
                j++;
            }
            num = num / 10;
            i++;
        }
        Arrays.sort(arr);
        int m=0;
        for(int k=0; k<arr.length; k++){
            if(arr[k]%2==1){
                arr[k]=brr[m];
                m++;
            }
        }
        String number = "";
        for(int k=0; k<arr.length; k++){
            number += arr[k] ;
        }
        System.out.println(number);
    }
}
