package Java_Programming;

import java.util.Scanner;

public class StrongNum {
    //    public static void main(String[] args) {
//        int no = 145;
//        int copy= no;
//        int sum =0;
//        while(no!=0)
//        {
//            int rem = no % 10;
//            int fact = 1;
//            for (int i = rem; i >= 1; i--) {
//                fact = fact * i;
//            }
//            sum = sum + fact;
//            no = no/10;
//        }
//        if(sum == copy){
//            System.out.println("Its a Strong num.");
//        }else{
//            System.out.println("Not a strong num.");
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int no = sc.nextInt();
        checkStrong(no);
    }

    static void checkStrong(int no){
        int copy = no;
        int sum = 0;
        while(no!=0)
        {
            int rem = no % 10;
            int fact = 1;
            for (int i = rem; i >= 1; i--) {
                fact = fact * i;
            }
            sum = sum + fact;
            no = no/10;
        }
        if(sum == copy){
            System.out.println(copy+" a Strong num.");
        }else{
            System.out.println(copy+" Not a strong num.");
        }
    }

}
