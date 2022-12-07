package Java_Programming.ArraysOpertion;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = {121,146,721,171,23632};
        for(int i =0; i<arr.length; i++){
            int rev = 0; int no = arr[i];
            while(no!=0){
                int rem = no%10;
                rev = (rev*10)+rem;
                no=no/10;
            }
            if(rev == arr[i]){
                System.out.println(arr[i]+" is a palindrome");
            }
        }
    }
}
