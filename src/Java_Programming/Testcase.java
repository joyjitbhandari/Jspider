package Java_Programming;

import java.util.Scanner;

public class Testcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the upper case starting num, lower case starting num, and number starting point ");
        int upch = sc.nextInt();
        int lowch = sc.nextInt();
        int num = sc.nextInt();
        if(upch >= 65 && lowch >= 97 && num>0){
            for(int i= upch; i<=90; i++){
                for(int j =lowch; j<=122; j++){
                    for(int k =num; k<=26-num; k++){
                        char up = (char) upch;
                        char low = (char) lowch;
                        System.out.println(up+" "+low+" "+ num);
                         upch++;
                         lowch++;
                         num++;
                    }
                }
            }
        }
    }
}
