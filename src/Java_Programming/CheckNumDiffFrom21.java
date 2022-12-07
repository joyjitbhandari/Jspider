package Java_Programming;

import java.util.Scanner;

public class CheckNumDiffFrom21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number");
        int n = sc.nextInt();
        if(n<=21){
            System.out.println(21 - n);
        }else {
            int num = n- 21;
            System.out.println(num*2);
        }
    }
}
