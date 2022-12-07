package Java_Concepts_Assignment;

// Write 8 program to calculate areas with the method b/w classes without returning any value, parameter.\
public class Assignment6 {
    public static void main(String[] args) {
        Triangle.area();
        Square.area();
        Rectangle.area();
        Circle.area();
        Trapezoid.area();
        Eclipse.area();
        Sector.area();
        Parallelogram.area();
    }
}

    class Triangle{
        static void area() {
            int b = 10;
            int h = 5;
            double res = 0.5 * b * h;
            System.out.println("The triangle area is " + res + "\n");
        }
    }
    class Square{
        static void area() {
            int a = 10;
            double res = a * a;
            System.out.println("The square area is " + res + "\n");
        }
    }

    class Rectangle{
        static void area() {
            int w = 8;
            int h = 5;
            double res = w * h;
            System.out.println("The Rectangle area is " + res + "\n");
        }
    }

    class Circle{
        static void area() {

            int r = 4;
            final double pi = 3.142;
            double res = pi * r * r;
            System.out.println("The Circle area is " + res + "\n");
        }
    }

   class Trapezoid{
       static void area() {
           int a = 12;
           int b = 20;
           int h = 5;
           double res = 0.5 * (a + b) * h;
           System.out.println("The trapezoid area is " + res + "\n");
       }
   }

    class Eclipse {
        static void area() {
            int a = 5;
            int b = 4;
            final double pi = 3.142;
            double res = pi * a * b;
            System.out.println("The Eclipse area is " + res + "\n");
        }
    }

    class Sector {
        static void area() {
            int r = 10;
            int theta = 45;
            double res = 0.5 * r * r * theta;
            System.out.println("The Sector area is " + res + "\n");
        }
    }

   class Parallelogram {
       static void area() {
           int b = 10;
           int h = 5;
           double res = b * h;
           System.out.println("The parallelogram area is " + res + "\n");
       }
   }
