package Java_Programming.ArraysOpertion;
import java.util.Scanner;
public class CheckingArrInBtwTen_Twenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arr length");
        int size = sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter array elements");
        for(int i =0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        checkArr(arr);
    }
    static void checkArr(int[] arr){
        int count = 0;
        for(int j = 0; j<arr.length; j++){
            if(arr[j]>10 && arr[j]<20) {
                count++;
            }
        }
        System.out.println("Number of count for above 10 and below 20 is :-  "+count);
    }
}
