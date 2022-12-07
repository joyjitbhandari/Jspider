package Java_Programming.equals_Method;
public class Mobile {
    String model;
    int cost ;
    String colour;
    Mobile(String model, int cost, String colour){
        this.model = model;
        this.cost = cost;
        this.colour = colour;
    }
    public boolean equals(Object obj){
        Mobile m = (Mobile) obj;
        return this.cost==m.cost;
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Realme",25000, "Gray");
        Mobile m2= new Mobile("Asus",15000, "Blue");
        if(m1.equals(m2)){
            System.out.println("Both Mobiles cost are equal");
        }else {
            System.out.println("Mobiles cost are not equal");
        }
    }
}
