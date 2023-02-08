package Latters;

import javax.sound.midi.Soundbank;

public class E_printing {
    public static void main(String[] args) {
        int n=7;
        for(int i=1; i<=n;i++){
            if(i==1 || i==n){
            System.out.print("  ");
            }
            else {
                System.out.print("E ");
            }
            for(int j=1; j<=n-1; j++){
                if(i==1 || i==n/2+1 || i==n){
                    System.out.print("E ");
                }
            }
            System.out.println("  ");
        }
    }
}
