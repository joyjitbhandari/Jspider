package ToString_Method;

public class Bike {

    String model;
    int cost ;
    String Brand;
    Bike(String model, int cost, String Brand){
        this.model = model;
        this.cost = cost;
        this.Brand = Brand;
    }
    public String toString(){
        return "Model Name:- "+this.model+", Cost:- "+this.cost+", Brand Name :- "+this.Brand;
    }

    public static void main(String[] args) {
        Bike B = new Bike("Splinder",95000, "Hero");
        System.out.println(B.toString());
        Bike B1 = new Bike("Ninja H2",400000, "Kawasaki");
        System.out.println(B1.toString());
    }
}
