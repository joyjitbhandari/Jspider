package Java_Programming;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        System.out.println("the reverse sentence is :- "+reverse(str));
    }
    static String reverse(String str){
        String[] str1 = str.split(" ");
        String rev = "";
        for(int i = str1.length-1; i>=0;i--){
            rev = rev+str1[i]+" ";
        }
        return rev;
    }
}
