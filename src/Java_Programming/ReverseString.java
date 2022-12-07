package Java_Programming;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        //String str = "JAVA";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string \t");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("The reverse string is: "+rev);
    }
}
