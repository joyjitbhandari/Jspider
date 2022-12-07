package Java_Concepts_Assignment;

//Write 8 programs to calculate areas , nonstatic to static between classes using method with parameter.
public class Assignment13 {
    public static void main(String[] args){
        Triangle_13 T = new Triangle_13();
        T.area(10,5);

        Square_13 S = new Square_13();
        S.area(4);

        Rectangle_13 R = new Rectangle_13();
        R.area(8,9);

        Circle_13 C = new Circle_13();
        C.area(10);

        Trapezoid_13 Tr = new Trapezoid_13();
        Tr.area(10,5,8);

        Eclipse_13 E = new Eclipse_13();
        E.area(5,9);

        Sector_13 Se = new Sector_13();
        Se.area(7,90);

        Parallelogram_13 P = new Parallelogram_13();
        P.area(2,8);

    }
}
class Triangle_13{
    void area(int b, int h) {
        double res = 0.5 * b * h;
        System.out.println("The triangle area is " + res + "\n");
    }
}
class Square_13{
    void area(int a) {
        double res = a * a;
        System.out.println("The square area is " + res + "\n");
    }
}

class Rectangle_13{
    void area(int w,  int h) {
        double res = w * h;
        System.out.println("The Rectangle area is " + res + "\n");
    }
}

class Circle_13{
    void area(int r) {
        final double pi = 3.142;
        double res = pi * r * r;
        System.out.println("The Circle area is " + res + "\n");
    }
}

class Trapezoid_13{
    void area(int a, int b, int h) {
        double res = 0.5 * (a + b) * h;
        System.out.println("The trapezoid area is " + res + "\n");
    }
}

class Eclipse_13 {
    void area(int a, int b) {
        final double pi = 3.142;
        double res = pi * a * b;
        System.out.println("The Eclipse area is " + res + "\n");
    }
}

class Sector_13 {
    void area(int r, int theta) {
        double res = 0.5 * r * r * theta;
        System.out.println("The Sector area is " + res + "\n");
    }
}

class Parallelogram_13{
    void area(int b, int h) {
        double res = b * h;
        System.out.println("The parallelogram area is " + res + "\n");
    }
}
