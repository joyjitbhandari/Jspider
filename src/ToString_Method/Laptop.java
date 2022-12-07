package ToString_Method;

public class Laptop {

    String model;
    int cost ;
    String colour;
    Laptop(String model, int cost, String colour){
        this.model = model;
        this.cost = cost;
        this.colour = colour;
    }
    public String toString(){
        return "Model Name:- "+this.model+", Cost:- "+this.cost+", Colour:- "+this.colour;
    }

    public static void main(String[] args) {
        Laptop m = new Laptop("Hp",75000, "Black");
        System.out.println(m.toString());
        Laptop m1= new Laptop("Asus",70000, "White");
        System.out.println(m1.toString());
    }
}
