package Java_Concepts_Assignment;

//write 10 programs to print details using this keyword;
public class Assignment16 {
    public static void main(String[] args) {
        Car1 C = new Car1("BMW", 4500000, "Black");
        System.out.println("The car Details");
        System.out.println(C.brand + "\n" + C.cost + "\n" + C.color);

        Bike1 B = new Bike1("Royel Endfield", 450000, "Black");
        System.out.println("The Bike Details");
        System.out.println(B.brand + "\n" + B.cost + "\n" + B.color);

        Mobile1 M = new Mobile1("Realme", 15000, "Grey");
        System.out.println("The Mobile Details");
        System.out.println(M.brand + "\n" + M.cost + "\n" + M.color);

        School1 S = new School1("BKPSV", 2500, 'A');
        System.out.println("The School Details");
        System.out.println(S.name + "\n" + S.strength + "\n" + S.grade);

        Home1 H = new Home1("Sweet Home", 350000, "White");
        System.out.println("The Home Details");
        System.out.println(H.name + "\n" +H.cost + "\n" + H.color);

        Tv1 T = new Tv1("Mi", 15000, "Blck");
        System.out.println("The Tv Details");
        System.out.println(T.brand + "\n" + T.cost + "\n" + T.color);

        Course1 Co = new Course1("Java",36000);
        System.out.println("The Course Details");
        System.out.println(Co.name+"\n"+Co.fee);

        Laptop1 L = new Laptop1("Asus", 70000, "White");
        System.out.println("The Laptop Details");
        System.out.println(L.brand + "\n" + L.cost + "\n" + L.color);

        Emp1 E = new Emp1("Joyjit", 145682, 30000);
        System.out.println("The Emp Details");
        System.out.println(E.name + "\n" + E.id + "\n" + E.sal);

        Cloth1 Cl = new Cloth1("Rymond", 5000, "Red");
        System.out.println("The Cloth Details");
        System.out.println(Cl.brand + "\n" + Cl.cost + "\n" + Cl.color);

    }
}
class Car1 {
    String brand;
    double cost;
    String color;

    Car1(String brand, double cost, String color) {
        this.brand = brand;
        this.cost = cost;
        this.color = color;
    }
}

class Bike1 {
    String brand;
    double cost;
    String color;

    Bike1(String brand, double cost, String color) {
        this.brand = brand;
        this.cost = cost;
        this.color = color;
    }
}

class Mobile1 {
    String brand;
    double cost;
    String color;

    Mobile1(String brand, double cost, String color) {
        this.brand = brand;
        this.cost = cost;
        this.color = color;
    }
}

class School1 {
    String name;
    int strength;
    char grade;

    School1(String name, int strength, char grade) {
        this.name=name;
        this.strength = strength;
        this.grade =grade;
    }
}

class Home1 {
    String name;
    double cost;
    String color;

    Home1(String name, double cost, String color) {
        this.name = name;
        this.cost = cost ;
        this.color = color;
    }
}
class Tv1 {
    String brand;
    double cost;
    String color;

    Tv1(String brand, double cost, String color) {
        this.brand = brand;
        this.cost = cost;
        this.color = color;
    }
}
class Course1 {
    String name;
    double fee;

    Course1(String name, double fee) {
        this.name= name;
        this.fee = fee;
    }
}
class Laptop1 {
    String brand;
    double cost;
    String color;

    Laptop1(String brand, double cost, String color) {
        this.brand = brand;
        this.cost = cost;
        this.color = color;
    }
}
class Emp1 {
    String name;
    double id;
    int sal;

    Emp1(String name, double id, int sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }
}
class Cloth1 {
    String brand;
    double cost;
    String color;

    Cloth1(String brand, double cost, String color) {
        this.brand = brand;
        this.cost = cost;
        this.color = color;
    }
}

