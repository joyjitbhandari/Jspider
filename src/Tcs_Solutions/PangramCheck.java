package Tcs_Solutions;

import java.util.Arrays;
import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter strings");
        String string[] = new String[size];
        String res = "";
        for(int i=0; i<size; i++){
            string[i]= sc.next();
            res = res+isPan(string[i]);
        }
        System.out.println(res);
    }

    //1st method:-----------
//    static  int isPangram(String str){
//        str = str.toLowerCase();
//        boolean flag = true;
//        for(char ch='a';ch<='z';ch++){
//            if(!str.contains(str.valueOf(ch))){
//                flag = false;
//                break;
//            }
//        }
//        if(flag)
//            return 1;
//        else
//            return 0;
//    }

    //2nd method:-------------
    static int isPan(String str){
        str = str.toLowerCase();
        int alpha[] = new int[26];
        int index,flag=1;
        for(int i=0; i<str.length();i++){
           if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
               index = str.charAt(i)-'a';
               alpha[index]= 1;
           }
        }
        for(int i=0; i<26;i++){
            if(alpha[i]==0){
                flag = 0;
            }
        }
        return flag;
    }
}
