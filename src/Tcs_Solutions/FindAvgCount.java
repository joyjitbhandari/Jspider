package Tcs_Solutions;
import java.util.Scanner;
public class FindAvgCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5], sum = 0, count=0;
        System.out.println("Enter 5 elements of array");
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }

        for(int i=0; i<arr.length;i++){
            if(arr[i]==sum/5){
                count++;
            }
        }
        System.out.println(count);
    }
}
