package Java_Concepts_Assignment;

//Write 8 programs to calculate the area from nonstatic to static using reference variable through method with parameter and with return type.
public class Assignment11 {
    public static void main(String[] args){
        Assignment11 reference = new Assignment11(); // creating Reference Variable.

        double triangle_res = reference.Triangle_area(10,20);
        System.out.println("The triangle area is " + triangle_res + "\n");

        double square_res = reference.square_area(10);
        System.out.println("The square area is " + square_res + "\n");

        double rect_res = reference.rectangle_area(5,12);
        System.out.println("The Rectangle area is " + rect_res + "\n");

        double paralle_res = reference.parallelogram_area(2,8);
        System.out.println("The parallelogram area is " + paralle_res + "\n");

        double cir_res= reference.circle_area(8);
        System.out.println("The Circle area is " + cir_res + "\n");

        double tra_res = reference.trapezoid_area(8,5,10);
        System.out.println("The trapezoid area is " + tra_res + "\n");

        double ec_res = reference.eclips_area(10,9);
        System.out.println("The Eclipse area is " +ec_res + "\n");

        double sec_res = reference.sector_area(5,48);
        System.out.println("The Sector area is " + sec_res + "\n");

    }
     double Triangle_area(int b, int h){
        double res = 0.5* b * h;
        return res;
    }
    double square_area(int a ){
        double res = a * a;
        return res;
    }
    double rectangle_area(int w, int h){
        double res = w * h;
        return res;
    }
    double parallelogram_area(int b, int h) {
        double res = b * h;
        return res;
    }
    double circle_area(int r) {
        final double pi = 3.142;
        double res = pi * r * r;
        return res;
    }
    double trapezoid_area(int a, int b,int h) {
        double res = 0.5 * (a + b) * h;
        return res;
    }
    double eclips_area(int a, int b) {
        final double pi = 3.142;
        double res = pi * a * b;
        return res;
    }
   double sector_area(int r, int theta) {
        double res = 0.5 * r * r * theta;
        return res;
    }
}
