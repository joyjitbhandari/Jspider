package Two_Dimention_Array;

import java.util.Scanner;

public class Sum_of_cols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size");
        int row = sc.nextInt();
        System.out.println("Enter column Size");
        int col = sc.nextInt();
        int arr[][] = new  int[row][col];
        System.out.println("Enter "+row*col+" array elements");

        //taking 2d array input from user;
        for(int i =0; i<arr.length; i++){
            for (int j =0; j<arr[i].length; j++ ){
                arr[i][j]=sc.nextInt();
            }
        }

        //showing 2d array out[ut to user
        for(int i =0; i<arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //sum of rows
        for(int i =0; i<arr.length; i++){
            int sum = 0;
            for (int k =0; k<arr[i].length; k++ ){
                sum = sum+arr[k][i];
            }
            System.out.println("Sum of "+(i+1)+" columns is - "+sum);
        }
    }
}
