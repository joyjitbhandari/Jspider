package Java_Programming.equals_Method;

public class car {
    int cost ;
    String model;
    String type;
    car(int cost, String model, String type){
        this.model = model;
        this.cost = cost;
        this.type = type;
    }
    public boolean equals(Object obj){
        car c = (car) obj;
        return this.model == c.model;
    }

    public static void main(String[] args) {
        car c1 = new car(2500000,"thar","offroad");
        car c2 = new car(1250000,"Cedan","Family");
        if(c1.equals(c2)){
            System.out.println("Both car models are equal");
        }else {
            System.out.println("Car models are not equal");
        }
    }
}
