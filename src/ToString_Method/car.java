package ToString_Method;

public class car {
    int cost ;
    String model;
    String type;
    car(int cost, String model, String type){
        this.model = model;
        this.cost = cost;
        this.type = type;
    }
    public String toString(){
        return "Model:- "+this.model+", Cost:- "+this.cost+", Type:- "+this.type;
    }

    public static void main(String[] args) {
        car c = new car(2500000,"thar","offroad");
        System.out.println(c.toString());
        car c1 = new car(1250000,"Cedan","Family");
        System.out.println(c1.toString());
    }
}
