package ToString_Method;

public class Tv {
    String model;
    int cost ;
    String colour;
    Tv(String model, int cost, String colour){
        this.model = model;
        this.cost = cost;
        this.colour = colour;
    }
    public String toString(){
        return "Model Name:- "+this.model+", Cost:- "+this.cost+", Colour:- "+this.colour;
    }

    public static void main(String[] args) {
        Tv t = new Tv("Realme",15000, "Black");
        System.out.println(t.toString());
        Tv t1= new Tv("Mi",13000, "Black");
        System.out.println(t1.toString());
    }
}
