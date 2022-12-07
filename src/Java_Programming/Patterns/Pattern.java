package Java_Programming.Patterns;

public class Pattern {
    public static void main(String[] args){
        ptr1();
        System.out.println();
        ptr2();
        System.out.println();
        ptr3();
        System.out.println();
        ptr4();
        System.out.println();
        ptr5();
        System.out.println();
        ptr6();
        System.out.println();
        ptr7();
        System.out.println();
        ptr8();
        System.out.println();
        ptr9();
        System.out.println();
        ptr10();

    }
    static void ptr1(){
        for (int i =1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void ptr2(){
        for (int i =1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void ptr3(){
        for (int i =1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                System.out.print(i%2);
            }
            System.out.println();
        }
    }

    static void ptr4(){
        for (int i =1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void ptr5(){
        for (int i =1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                System.out.print(j%2);
            }
            System.out.println();
        }
    }

    static void ptr6(){
        for (int i =1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void ptr7(){
        for (int i =1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void ptr8(){
        for (int i =1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void ptr9(){
        for (char i ='a'; i<='e'; i++){
            for(char j = 'a'; j<='e'; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void ptr10(){
        for (char i ='a'; i<='e'; i++){
            for(char j = 'a'; j<='e'; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
