package Java_Programming;

import java.util.Arrays;

public class arrayZigzagSoring {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] brr ={7,8,9,10,11,12};
        int[] ans = new int[arr.length+brr.length];
        int j=0, k=0;
        for(int i=0; i<ans.length; i++){
            if(i%2==0){
                ans[i]=arr[j];j++;
            }else{
                ans[i]=brr[k];k++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
