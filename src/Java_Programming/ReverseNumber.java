package Java_Programming;
import java.util.Scanner;

public class ReverseNumber {
    static void reverse(int num){
        int rev = 0;
        while(num!=0){
            int rem = num%10;
            rev = (rev*10) + rem;
            num = num/10;
        }
        System.out.println("Reverse number is "+rev);
    }

    public static void main(String[] args) {
        System.out.print("Enter a number\t");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        reverse(no);
    }
}
