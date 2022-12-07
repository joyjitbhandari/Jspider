package Java_Concepts_Assignment;

// Write 8 program to calculate areas of Triangle, Square, Rectangle, Circle, Trapezoid, Parallelogram, Eclipse, Sector.
public class Assignment2 {
    public static void main(String[] args){
        Triangle();
        Square();
        Rectangle();
        Circle();
        Trapezoid();
        Eclipse();
        Sector();
        Parallelogram();
    }

    static void Triangle(){
        int b = 10;
        int h = 5;
        double res = 0.5*b*h;
        System.out.println("The triangle area is "+res+"\n");
    }
    static void Square(){
        int a = 10;
        double res = a*a;
        System.out.println("The square area is "+res+"\n");
    }

    static void Rectangle(){
        int w = 8;
        int h = 5;
        double res =w*h;
        System.out.println("The Rectangle area is "+res+"\n");
    }

    static void Circle(){
        int r = 4;
        final double pi = 3.142;
        double res = pi*r*r;
        System.out.println("The Circle area is "+res+"\n");
    }

    static void Trapezoid(){
        int a = 12;
        int b = 20;
        int h = 5;
        double res = 0.5*(a+b)*h;
        System.out.println("The trapezoid area is "+res+"\n");
    }

    static void Eclipse(){
        int a = 5;
        int b = 4;
        final double pi = 3.142;
        double res = pi*a*b;
        System.out.println("The Eclipse area is "+res+"\n");
    }

    static void Sector(){
        int r = 10;
        int theta = 45;
        double res = 0.5*r*r*theta;
        System.out.println("The Sector area is "+res+"\n");
    }

    static void Parallelogram(){
        int b = 10;
        int h = 5;
        double res = b*h;
        System.out.println("The parallelogram area is "+res+"\n");
    }
}
