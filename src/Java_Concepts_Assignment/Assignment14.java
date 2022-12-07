package Java_Concepts_Assignment;

//Write 8 programs to calculate areas , nonstatic to static between classes using method with parameter ,return type.
public class Assignment14 {
    public static void main(String[] args){
        Triangle_14 T = new Triangle_14();
        double Tri = T.area(10,5);
        System.out.println("The triangle area is " + Tri + "\n");

        Square_14 S = new Square_14();
        double sqr = S.area(4);
        System.out.println("The square area is " + sqr + "\n");

        Rectangle_14 R = new Rectangle_14();
        double rec = R.area(8,9);
        System.out.println("The Rectangle area is " + rec + "\n");

        Circle_14 C = new Circle_14();
        double cir = C.area(10);
        System.out.println("The Circle area is " + cir + "\n");

        Trapezoid_14 Tr = new Trapezoid_14();
        double tre = Tr.area(10,5,8);
        System.out.println("The trapezoid area is " + tre + "\n");

        Eclipse_14 E = new Eclipse_14();
        double ecl = E.area(5,9);
        System.out.println("The Eclipse area is " + ecl + "\n");

        Sector_14 Se = new Sector_14();
        double sec = Se.area(7,30.5);
        System.out.println("The Sector area is " + sec + "\n");

        Parallelogram_14 P = new Parallelogram_14();
        double par = P .area(2,8);
        System.out.println("The parallelogram area is " + par + "\n");

    }
}
class Triangle_14{
    double area(int b, int h) {
        double res = 0.5 * b * h;
        return res;
    }
}
class Square_14{
    double area(int a) {
        double res = a * a;
        return res;
    }
}

class Rectangle_14{
    double area(int w,  int h) {
        double res = w * h;
        return res;
    }
}

class Circle_14{
    double area(int r) {
        final double pi = 3.142;
        double res = pi * r * r;
        return res;
    }
}

class Trapezoid_14{
    double area(int a, int b, int h) {
        double res = 0.5 * (a + b) * h;
        return res;
    }
}

class Eclipse_14 {
    double area(int a, int b) {
        final double pi = 3.142;
        double res = pi * a * b;
        return res;
    }
}

class Sector_14 {
    double area(int r, double theta) {
        double res = 0.5 * r * r * theta;
        return res;
    }
}

class Parallelogram_14{
    double area(int b, int h) {
        double res = b * h;
        return res;
    }
}
