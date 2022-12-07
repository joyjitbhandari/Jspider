package Java_Concepts_Assignment;

//Write 8 programs to calculate areas method with parameters.
public class Assignment4 {
    public static void main(String[] args){
        Triangle(10,20);
        Square(5);
        Rectangle(10,50);
        Circle(12);
        Trapezoid(14,15,17);
        Eclipse(15,10);
        Sector(5,45);
        Parallelogram(14,10);
    }


    static void Triangle(int b,int h){
        double res = 0.5*b*h;
        System.out.println("The triangle area is "+res+"\n");
    }
    static void Square(int a){
        double res = a*a;
        System.out.println("The square area is "+res+"\n");
    }

    static void Rectangle(int w,int h){
        double res =w*h;
        System.out.println("The Rectangle area is "+res+"\n");
    }

    static void Circle(int r){
        final double pi = 3.142;
        double res = pi*r*r;
        System.out.println("The Circle area is "+res+"\n");
    }

    static void Trapezoid(int a, int b, int h){
        double res = 0.5*(a+b)*h;
        System.out.println("The trapezoid area is "+res+"\n");
    }

    static void Eclipse(int a, int b){
        final double pi = 3.142;
        double res = pi*a*b;
        System.out.println("The Eclipse area is "+res+"\n");
    }

    static void Sector(int r, int theta){
        double res = 0.5*r*r*theta;
        System.out.println("The Sector area is "+res+"\n");
    }

    static void Parallelogram(int b, int h){
        double res = b*h;
        System.out.println("The parallelogram area is "+res+"\n");
    }
}
