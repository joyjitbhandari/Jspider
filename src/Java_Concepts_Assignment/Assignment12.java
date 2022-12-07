package Java_Concepts_Assignment;

// Write 8 programs to calculate areas , nonstatic to static between classes.
public class Assignment12 {
    public static void main(String[] args){
        Triangle_12 T = new Triangle_12();
        T.area();

        square_12 S = new square_12();
        S.area();

        Rectangle_12 R = new Rectangle_12();
        R.area();

        Circle_12 C = new Circle_12();
        C.area();

        Trapezoid_12 Tr = new Trapezoid_12();
        Tr.area();

        Eclipse_12 E = new Eclipse_12();
        E.area();

        Sector_12 Se = new Sector_12();
        Se.area();

        Parallelogram_12 P = new Parallelogram_12();
        P.area();

    }
}
class Triangle_12{
    void area() {
        int b = 10;
        int h = 5;
        double res = 0.5 * b * h;
        System.out.println("The triangle area is " + res + "\n");
    }
}
class square_12 {
    void area() {
        int a = 10;
        double res = a * a;
        System.out.println("The square area is " + res + "\n");
    }
}

class Rectangle_12{
    void area() {
        int w = 8;
        int h = 5;
        double res = w * h;
        System.out.println("The Rectangle area is " + res + "\n");
    }
}

class Circle_12{
    void area() {
        int r = 4;
        final double pi = 3.142;
        double res = pi * r * r;
        System.out.println("The Circle area is " + res + "\n");
    }
}

class Trapezoid_12{
    void area() {
        int a = 12;
        int b = 20;
        int h = 5;
        double res = 0.5 * (a + b) * h;
        System.out.println("The trapezoid area is " + res + "\n");
    }
}

class Eclipse_12 {
    void area() {
        int a = 5;
        int b = 4;
        final double pi = 3.142;
        double res = pi * a * b;
        System.out.println("The Eclipse area is " + res + "\n");
    }
}

class Sector_12 {
    void area() {
        int r = 10;
        int theta = 45;
        double res = 0.5 * r * r * theta;
        System.out.println("The Sector area is " + res + "\n");
    }
}

class Parallelogram_12 {
    void area() {
        int b = 10;
        int h = 5;
        double res = b * h;
        System.out.println("The parallelogram area is " + res + "\n");
    }
}
