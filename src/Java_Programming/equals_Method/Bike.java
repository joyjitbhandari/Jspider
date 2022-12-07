package Java_Programming.equals_Method;

public class Bike {
    String model;
    int cost ;
    String Brand;
    Bike(String model, int cost, String Brand){
        this.model = model;
        this.cost = cost;
        this.Brand = Brand;
    }
    public boolean equals(Object obj){
        Bike B = (Bike) obj;
        return this.cost==B.cost;
    }

    public static void main(String[] args) {
        Bike B1 = new Bike("Splinder",95000, "Hero");
        Bike B2 = new Bike("Ninja H2",400000, "Kawasaki");
        if(B1.equals(B2)){
            System.out.println("Both Bike costs are equal");
        }else {
            System.out.println("Bike costs are not equal");
        }
    }
}
