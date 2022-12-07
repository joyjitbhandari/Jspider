package Java_Concepts_Assignment;

// Write 8 program to calculate areas with the method b/w classes with returning any value, parameter
public class Assignment7{
    public static void main(String[] args) {
        double Tri = Triangle1.area(10,20);
        System.out.println("The triangle area is " + Tri + "\n");

        double S = Square1.area(5);
        System.out.println("The square area is " + S + "\n");

        double R = Rectangle1.area(15,20);
        System.out.println("The Rectangle area is " + R + "\n");

        double C = Circle1.area(10);
        System.out.println("The Circle area is " + C + "\n");

        double T = Trapezoid1.area(10,12,5);
        System.out.println("The trapezoid area is " + T + "\n");

        double Sec = Sector1.area(14,90);
        System.out.println("The Sector area is " + Sec + "\n");

        double E = Eclipse1.area(50, 12);
        System.out.println("The Eclipse area is " + E + "\n");

        double P = Parallelogram1.area(10,15);
        System.out.println("The parallelogram area is " + P + "\n");
    }
}

class Triangle1{
    static double area(int b, int h) {
        double res = 0.5 * b * h;
        return res;

    }
}
class Square1{
    static double area(int a) {
        double res = a * a;
        return res;
    }
}

class Rectangle1{
    static double area(int w, int h) {
        double res = w * h;
        return res;
    }
}

class Circle1{
    static double area(int r) {
        final double pi = 3.142;
        double res = pi * r * r;
        return res;
    }
}

class Trapezoid1{
    static double area(int a, int b, int h) {
        double res = 0.5 * (a + b) * h;
        return res;
    }
}

class Eclipse1 {
    static double area(int a, int b) {
        final double pi = 3.142;
        double res = pi * a * b;
        return res;
    }
}

class Sector1 {
    static double area(int r, int theta) {
        double res = 0.5 * r * r * theta;
       return res;
    }
}

class Parallelogram1 {
    static double area(int b, int h) {
        double res = b * h;
        return res;
    }
}
