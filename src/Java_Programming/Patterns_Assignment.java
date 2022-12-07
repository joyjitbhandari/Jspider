package Java_Programming;
public class Patterns_Assignment {
    public static void main(String[] args){
        char1();
        System.out.println();
        char2();
        System.out.println();
        num1();
        System.out.println();
        num2();
    }
    static void char1(){
        for(char i = 'a'; i<='e'; i++){
            for(char j='a'; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void char2(){
        for(char i = 'a'; i<='e'; i++){
            for(char j='a'; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void num1(){
        for(int i = 1; i<=5; i++){
            for(int  j=1; j<=i; j++){
                System.out.print(i%2);
            }
            System.out.println();
        }
    }
    static void num2(){
        for(int i = 1; i<=5; i++){
            for(int  j=1; j<=i; j++){
                System.out.print(j%2);
            }
            System.out.println();
        }
    }
}
