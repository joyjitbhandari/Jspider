package Java_Programming;

import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter operation name to perform");
        String ch = sc.next();
            calculator(ch, a, b);
    }
    static void calculator(String ch, int a, int b ){
         switch (ch){
             case "add":
                 System.out.println(a+b);
                 break;
             case "sub":
                 if(a>b) {
                     System.out.println(a - b);
                 }else System.out.println("1st number should be bigger then 2nd number");
                 break;
             case "mul":
                 System.out.println(a*b);
                 break;
             case "div":
                 if(a>b) {
                     System.out.println(a / b);
                 }else System.out.println("1st number should be bigger then 2nd number");
                 break;
             default:
                 System.out.println("Invalid operation");
         }
    }
}
