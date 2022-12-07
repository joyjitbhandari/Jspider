package Java_Programming.StringCharCounting;

import java.util.Scanner;

public class SpecialCharCount {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int count = 0;
        for(int i =0; i<str.length();i++){
            int hash = (int)str.charAt(i);
            boolean b = (hash > 90 && hash < 97) || (hash > 122 && hash < 177);
//            if((hash>31&&hash<48)||hash>57&&hash<65)||(hash>90&&hash<97)||(hash>122&&hash<177)){
//                count++;
//            }
        }
        System.out.println("The count of Special Characters Present in String is "+count);
    }
}
