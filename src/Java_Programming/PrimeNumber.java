package Java_Programming;

import java.util.Scanner;

public class PrimeNumber {
    static void cheakPrime(int num){
        boolean flag = true;
        for(int i = 2; i<num; i++){
            if(num%i==0){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println(num+" Is a prime number\n");
        }else{
            System.out.println(num+" Is not a prime number\n");
        }
    }


    public static void main(String[] args) {
        // for static input
        cheakPrime(10);

        // for dynamic input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check:- \t");
        int num = sc.nextInt();
        cheakPrime(num);
    }

}
