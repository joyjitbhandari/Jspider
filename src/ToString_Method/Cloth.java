package ToString_Method;

public class Cloth {

    String type;
    int cost ;
    String size;
    Cloth(String type, int cost, String size){
        this.type = type;
        this.cost = cost;
        this.size = size;
    }
    public String toString(){
        return "Cloth Type :- "+this.type+", Cost:- "+this.cost+", Size:- "+this.size;
    }

    public static void main(String[] args) {
        Cloth c = new Cloth("Shirt",2000,"40");
        System.out.println(c.toString());
        Cloth c1 = new Cloth("Pant",2500,"30");
        System.out.println(c1.toString());
    }
}
