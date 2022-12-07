package ToString_Method;

public class Home {

    String name;
    int cost ;
    String colour;
    Home(String name, int cost, String colour){
        this.name =name;
        this.cost = cost;
        this.colour = colour;
    }
    public String toString(){
        return "Home Name:- "+this.name+", Cost:- "+this.cost+", Colour:- "+this.colour;
    }

    public static void main(String[] args) {
        Home h = new Home("Villa",2500000, "White");
        System.out.println(h.toString());
        Home h1= new Home("Sweet home",1500000, "red");
        System.out.println(h1.toString());
    }
}
