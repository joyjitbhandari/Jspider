package Java_Programming.equals_Method;

public class Cloth {

    String type;
    int cost ;
    String size;
    Cloth(String type, int cost, String size){
        this.type = type;
        this.cost = cost;
        this.size = size;
    }
    public boolean equals(Object obj){
        Cloth c = (Cloth)obj;
        return this.cost == c.cost;
    }

    public static void main(String[] args) {
        Cloth c1 = new Cloth("Shirt",2000,"40");
        Cloth c2 = new Cloth("Pant",2500,"30");
        if(c1.equals(c2)){
            System.out.println("Cloths cost are equal");
        }else {
            System.out.println("cloths cost are not equal");
        }
    }
}
