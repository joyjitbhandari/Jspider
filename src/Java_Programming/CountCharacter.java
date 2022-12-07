package Java_Programming;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        CountCharacter c = new CountCharacter();
        c.count(str);
    }
    void count(String Str){
        int[] arr = new int[122];
        for(int i =0 ; i< Str.length(); i++){
            char ch = Str.charAt(i);
            arr[ch]++;
        }
        for(int i =0; i<arr.length; i++){
            if(arr[i]!=0){
                System.out.println((char)(i)+" "+arr[i]);
            }
        }
    }
}
