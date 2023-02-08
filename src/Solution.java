import java.util.Arrays;
import java.util.Scanner;

public class Solution{

    // checking the string is anagram or not
    public static boolean isAnagram(String a,String b)
    {
        boolean flag = true;
        char arr[] = a.toCharArray();
        char brr[] = b.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);

        for(int i=0; i<arr.length; i++){
            if(arr[i] != brr[i]){
                flag = false;
                break;
            }
        }
        return flag;
    }

    // rotating the arr clockwise
    public static int[] arrRotatingClock(int[] arr, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many steps to rotate");
        int k = sc.nextInt();
        for(int i=0 ;i<k;i++){
            int temp = arr[n-1];
            for(int j =n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        return arr;
    }
    // rotating the arr anticlockwise
    public static int[] arrRotatingAntiClock(int[] arr, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many steps to rotate");
        int k = sc.nextInt();
        for(int i=0 ;i<k;i++){
            int temp = arr[0];
            for(int j =0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        // passing
        //value for string anagram
        //System.out.println(isAnagram("geekforgeens","forgeekgeeks"));

        // passing value to rotate array clockwise
        int arr[] = {10,20,30,40,50};
        System.out.println( "rotating array clockwise");
        System.out.println(Arrays.toString(arrRotatingClock(arr,arr.length)));

        // passing value to rotate array Anticlockwise
         int brr[] = {10,20,30,40,50};
        System.out.println( "rotating array Anticlockwise");
        System.out.println(Arrays.toString(arrRotatingAntiClock(brr,brr.length)));


    }
}