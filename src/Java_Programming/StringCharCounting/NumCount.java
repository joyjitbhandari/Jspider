package Java_Programming.StringCharCounting;

import java.util.Scanner;

public class NumCount {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int count = 0;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                count++;
            }
        }
        System.out.println("the count of numbers Present in String is "+count);
    }
}
