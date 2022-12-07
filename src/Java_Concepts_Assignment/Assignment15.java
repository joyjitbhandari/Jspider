package Java_Concepts_Assignment;

//write 10 programs to print details using constructor.
public class Assignment15 {
    public static void main(String[] args) {
        Car C = new Car("BMW", 4500000, " Black");
        System.out.println("The car Details");
        System.out.println(C.brand + "\n" + C.cost + "\n" + C.color);

        Bike B = new Bike("Royel Endfield", 450000, "Black");
        System.out.println("The Bike Details");
        System.out.println(B.brand + "\n" + B.cost + "\n" + B.color);

        Mobile M = new Mobile("Realme", 15000, "Grey");
        System.out.println("The Mobile Details");
        System.out.println(M.brand + "\n" + M.cost + "\n" + M.color);

        School S = new School("BKPSV", 2500, 'A');
        System.out.println("The School Details");
        System.out.println(S.name + "\n" + S.strength + "\n" + S.grade);

        Home H = new Home("Sweet Home", 350000, "White");
        System.out.println("The Home Details");
        System.out.println(H.name + "\n" +H.cost + "\n" + H.color);

        Tv T = new Tv("Mi", 15000, "Blck");
        System.out.println("The Tv Details");
        System.out.println(T.brand + "\n" + T.cost + "\n" + T.color);

        Course Co = new Course("Java",36000);
        System.out.println("The Course Details");
        System.out.println(Co.name+"\n"+Co.fee);

        Laptop L = new Laptop("Asus", 70000, "White");
        System.out.println("The Laptop Details");
        System.out.println(L.brand + "\n" + L.cost + "\n" + L.color);

        Emp E = new Emp("Joyjit", 145682, 30000);
        System.out.println("The Emp Details");
        System.out.println(E.name + "\n" + E.id + "\n" + E.sal);

        Cloth Cl = new Cloth("Rymond", 5000, "Red");
        System.out.println("The Cloth Details");
        System.out.println(Cl.brand + "\n" + Cl.cost + "\n" + Cl.color);

    }
}
    class Car {
        String brand;
        double cost;
        String color;

        Car(String x, double y, String z) {
            brand = x;
            cost = y;
            color = z;
        }
    }

    class Bike {
        String brand;
        double cost;
        String color;

        Bike(String x, double y, String z) {
            brand = x;
            cost = y;
            color = z;
        }
    }

    class Mobile {
        String brand;
        double cost;
        String color;

        Mobile(String x, double y, String z) {
            brand = x;
            cost = y;
            color = z;
        }
    }

class School {
    String name;
    int strength;
    char grade;

    School(String x, int y, char z) {
        name = x;
        strength = y;
        grade = z;
    }
}

class Home {
    String name;
    double cost;
    String color;

    Home(String x, double y, String z) {
        name = x;
        cost = y;
        color = z;
    }
}
class Tv {
    String brand;
    double cost;
    String color;

    Tv(String x, double y, String z) {
        brand = x;
        cost = y;
        color = z;
    }
}
class Course {
    String name;
    double fee;

    Course(String x, double y) {
        name = x;
        fee = y;
    }
}
class Laptop {
    String brand;
    double cost;
    String color;

    Laptop(String x, double y, String z) {
        brand = x;
        cost = y;
        color = z;
    }
}
class Emp {
    String name;
    double id;
    int sal;

    Emp(String x, double y, int z) {
        name = x;
        id = y;
        sal = z;
    }
}
class Cloth {
    String brand;
    double cost;
    String color;

    Cloth(String x, double y, String z) {
        brand = x;
        cost = y;
        color = z;
    }
}
