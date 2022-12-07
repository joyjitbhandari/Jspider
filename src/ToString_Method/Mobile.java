package ToString_Method;
public class Mobile {
    String model;
    int cost ;
    String colour;
    Mobile(String model, int cost, String colour){
        this.model = model;
        this.cost = cost;
        this.colour = colour;
    }
    public String toString(){
        return "Model Name:- "+this.model+", Cost:- "+this.cost+", Colour:- "+this.colour;
    }

    public static void main(String[] args) {
        Mobile m = new Mobile("Realme",25000, "Gray");
        System.out.println(m.toString());
        Mobile m1= new Mobile("Asus",15000, "Blue");
        System.out.println(m1.toString());
    }
}
