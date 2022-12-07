package Java_Concepts_Assignment;

//Write 8 programs to calculate areas method with parameters and return type.
public class Assignment5 {
    public static void main(String[] args){
        double x = Triangle(10,20);
        System.out.println("The triangle area is "+x+"\n");

        double res = Square(5);
        System.out.println("The square area is "+res+"\n");

        double R = Rectangle(10,50);
        System.out.println("The Rectangle area is "+R+"\n");

        double C = Circle(12);
        System.out.println("The Circle area is "+C+"\n");

        double T = Trapezoid(14,15,17);
        System.out.println("The trapezoid area is "+T+"\n");

        double E = Eclipse(15,10);
        System.out.println("The Eclipse area is "+E+"\n");

        double S = Sector(5,45);
        System.out.println("The Sector area is "+S+"\n");

        Double P= Parallelogram(14,10);
        System.out.println("The parallelogram area is "+P+"\n");
    }
    static double Triangle(int b,int h){
        double res = 0.5*b*h;
        return res ;
    }
    static double Square(int a){
        double res = a*a;
        return res;
    }

    static double Rectangle(int w,int h){
        double res =w*h;
        return res;
    }

    static double Circle(int r){
        final double pi = 3.142;
        double res = pi*r*r;
        return res;

    }

    static double Trapezoid(int a, int b, int h){
        double res = 0.5*(a+b)*h;
        return res;
    }

    static double Eclipse(int a, int b){
        final double pi = 3.142;
        double res = pi*a*b;
        return res;
    }

    static double Sector(int r, int theta){
        double res = 0.5*r*r*theta;
        return res;
    }

    static double Parallelogram(int b, int h){
        double res = b*h;
        return res;
    }
}
