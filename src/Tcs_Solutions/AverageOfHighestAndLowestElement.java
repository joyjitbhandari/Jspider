package Tcs_Solutions;

import java.util.Scanner;
public class AverageOfHighestAndLowestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[4];
        for (int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(avg(arr));
    }
   static double avg(double arr[]){
       double low =  arr[0] , high = arr[0], sum=0 , count=0;
        for(int i=1 ; i<arr.length; i++){
            if(low>arr[i])
                  low = arr[i];
            if(high<arr[i])
                high=arr[i];
        }

        for (int i=0; i<arr.length; i++){
            if(arr[i]==high || arr[i]==low){
                sum+=arr[i];
                count++;
            }
        }
       return sum/count;
   }
}

