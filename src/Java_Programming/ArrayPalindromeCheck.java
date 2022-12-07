package Java_Programming;
import java.util.Scanner;
public class ArrayPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter array elements");
        for(int i =0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        boolean flag = palindrome(arr);
        if(flag)
            System.out.println("its palindrome");
        else
            System.out.println("its not palindrome");
    }
    private static boolean palindrome(int[] arr){
        int i =0;
        int j = arr.length-1;
        while(i<arr.length/2){
            if (arr[i] != arr[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}
