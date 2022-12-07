package Java_Programming.SolidPatarns;

public class downPyramid {
    public static void main(String[] args) {
        int n = 7 , star=n, space=0;
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=space ; j++ ) {
                System.out.print(" ");
            }
            for (int k=1; k<=star; k++){
                System.out.print("*");
            }
            System.out.println();
                space++;
                star-=2;
        }
    }
}

