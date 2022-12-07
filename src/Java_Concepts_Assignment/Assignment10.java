package Java_Concepts_Assignment;

//Write 8 programs to calculate the area from nonstatic to static using reference variable through method with parameter.
public class Assignment10 {
    public static void main(String[] args){
        Assignment10 reference = new Assignment10(); // creating Reference Variable.

        reference.Triangle_area(10,20);
        reference.square_area(10);
        reference.rectangle_area(5,12);
        reference.parallelogram_area(2,8);
        reference.circle_area(8);
        reference.trapezoid_area(8,5,10);
        reference.eclips_area(10,9);
        reference.sector_area(5,48);

    }
    void Triangle_area(int b, int h){
        double res = 0.5* b * h;
        System.out.println("The triangle area is " + res + "\n");
    }
    void square_area(int a ){
        double res = a * a;
        System.out.println("The square area is " + res + "\n");

    }
    void rectangle_area(int w, int h){

        double res = w * h;
        System.out.println("The Rectangle area is " + res + "\n");
    }
    void parallelogram_area(int b, int h) {
        double res = b * h;
        System.out.println("The parallelogram area is " + res + "\n");
    }
    void circle_area(int r) {
        final double pi = 3.142;
        double res = pi * r * r;
        System.out.println("The Circle area is " + res + "\n");
    }
    void trapezoid_area(int a, int b,int h) {
        double res = 0.5 * (a + b) * h;
        System.out.println("The trapezoid area is " + res + "\n");
    }
    void eclips_area(int a, int b) {
        final double pi = 3.142;
        double res = pi * a * b;
        System.out.println("The Eclipse area is " + res + "\n");
    }
    void sector_area(int r, int theta) {
        double res = 0.5 * r * r * theta;
        System.out.println("The Sector area is " + res + "\n");
    }
}
