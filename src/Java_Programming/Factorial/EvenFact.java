package Java_Programming.Factorial;

public class EvenFact {
    public static void main(String[] args) {
        for(int i =1; i<=10; i++) {
            int fact = 1;
            if(i%2==0) {
                for(int j=1; j<=i; j++) {
                    fact = fact*j;
                }
                System.out.println(i+" = "+ fact);
            }
        }
    }

}
