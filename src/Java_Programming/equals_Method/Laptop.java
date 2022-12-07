package Java_Programming.equals_Method;

public class Laptop {

    String model;
    int cost ;
    String colour;
    Laptop(String model, int cost, String colour){
        this.model = model;
        this.cost = cost;
        this.colour = colour;
    }
    public boolean equals(Object obj){
        Laptop l = (Laptop) obj;
        return this.cost == l.cost;
    }
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Hp",75000, "Black");
        Laptop l2= new Laptop("Asus",70000, "White");
        if(l1.equals(l2)){
            System.out.println("Both Laptop costs are equal");
        }else {
            System.out.println("Laptop costs are not equal");
        }
    }
}
