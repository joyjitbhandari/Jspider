package Java_Concepts_Assignment;

//Write 8 programs to calculate the area from nonstatic to static using reference variable.
public class Assignment9 {
    public static void main(String[] args){
        Assignment9 reference = new Assignment9(); // creating Reference Variable.

        reference.Triangle_area();
        reference.square_area();
        reference.rectangle_area();
        reference.parallelogram_area();
        reference.circle_area();
        reference.trapezoid_area();
        reference.eclips_area();
        reference.sector_area();

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
