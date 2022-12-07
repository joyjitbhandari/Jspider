package Java_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two same length String:- ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        checkAnagram(str1,str2);
    }
    static void checkAnagram(String s1, String s2){
        boolean flag = true;
        if(s1.length()==s2.length()){
            char[] ch1 = s1.toCharArray();
            char[] ch2 =  s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            for(int i =0; i<ch1.length; i++){
                if(ch1[i]!=ch2[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("it is an Anagram.");
            }else{
                System.out.println("It is not an Anagram.");
            }
        }else {
            System.out.println("String length not matching.");
        }
    }
}
