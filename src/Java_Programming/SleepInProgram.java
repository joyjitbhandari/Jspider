package Java_Programming;

import java.util.Scanner;

public class SleepInProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weekday status");
        boolean weekday = sc.nextBoolean();
        System.out.println("Enter the vacation status");
        boolean vacation = sc.nextBoolean();
        System.out.println("The answer is : "+sleepIn(weekday,vacation));
    }
    public static boolean sleepIn(boolean weekDay ,boolean vacation){
        if(weekDay || !vacation){
            return true;
        }else {
            return false;
        }
    }
}
