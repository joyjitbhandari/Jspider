package Java_Programming.equals_Method;

public class Tv {
    String model;
    int cost ;
    String colour;
    Tv(String model, int cost, String colour){
        this.model = model;
        this.cost = cost;
        this.colour = colour;
    }
    public boolean equals(Object obj){
        Tv t = (Tv) obj;
        return this.cost == t.cost;
    }

    public static void main(String[] args) {
        Tv t1 = new Tv("Realme",15000, "Black");
        Tv t2= new Tv("Mi",13000, "Black");
        if(t1.equals(t2)){
            System.out.println("The cost of both tvs are same.");
        }else {
            System.out.println("The cost is not equal.");
        }
    }
}
