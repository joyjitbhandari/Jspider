package Java_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfFirstThreeNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter more than 3 digit number");
        int num = sc.nextInt();
        int sum=0;
        String str = Integer.toString(num);
        for (int i=0; i<3; i++){
            char ch = str.charAt(i);
            sum=sum+(ch-48);
        }
        System.out.println(sum);
    }
}
