package Java_Concepts_Assignment;

// Write 8 program to calculate areas with the method b/w classes using nonstatic to static.
public class Assignment8 {
    public static void main(String[] args){
        new Assignment8().Triangle_area();
        new Assignment8().square_area();
        new Assignment8().rectangle_area();
        new Assignment8().parallelogram_area();
        new Assignment8().circle_area();
        new Assignment8().trapezoid_area();
        new Assignment8().eclips_area();
        new Assignment8().sector_area();

    }
    void Triangle_area(){
        int b = 2;
        int h = 10;
        double res = 0.5* b * h;
        System.out.println("The triangle area is " + res + "\n");
    }
    void square_area(){
        int a = 10;
        double res = a * a;
        System.out.println("The square area is " + res + "\n");

    }
    void rectangle_area(){
        int w = 8;
        int h = 5;
        double res = w * h;
        System.out.println("The Rectangle area is " + res + "\n");
    }
    void parallelogram_area(){
        int b = 10;
        int h = 5;
        double res = b * h;
        System.out.println("The parallelogram area is " + res + "\n");
    }
    void circle_area() {
        int r = 4;
        final double pi = 3.142;
        double res = pi * r * r;
        System.out.println("The Circle area is " + res + "\n");
    }
    void trapezoid_area() {
        int a = 12;
        int b = 20;
        int h = 5;
        double res = 0.5 * (a + b) * h;
        System.out.println("The trapezoid area is " + res + "\n");
    }
    void eclips_area() {
        int a = 5;
        int b = 4;
        final double pi = 3.142;
        double res = pi * a * b;
        System.out.println("The Eclipse area is " + res + "\n");
    }
    void sector_area() {
        int r = 10;
        int theta = 45;
        double res = 0.5 * r * r * theta;
        System.out.println("The Sector area is " + res + "\n");
    }
}
