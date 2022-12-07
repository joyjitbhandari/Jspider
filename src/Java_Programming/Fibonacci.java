package Java_Programming;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Fibonacci {
    static void fibonacci(int range){
        int n1 =0,n2=1,n3=0;
        System.out.println (" The fibonacci numbers are: ");
        for(int i = 1; i<=range; i++){
            n3 = n1+n2;
            System.out.print("  "+n3);
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args) {
        // for static input
        fibonacci(5);

        //for dynamic input
        System.out.print("\n Provide number of iteration for fibonacci:-\t");
        Scanner sc = new Scanner(System.in);
        int itearation = sc.nextInt();
        fibonacci(itearation);
    }
}
