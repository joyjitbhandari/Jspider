package Java_Programming.equals_Method;

public class Home {

    String name;
    int cost ;
    String colour;
    Home(String name, int cost, String colour){
        this.name =name;
        this.cost = cost;
        this.colour = colour;
    }
    public boolean equals(Object obj){
        Home h = (Home) obj;
        return this.cost == h.cost;
    }

    public static void main(String[] args) {
        Home h1 = new Home("Villa",2500000, "White");
        Home h2= new Home("Sweet home",1500000, "red");
        if(h1.equals(h2)){
            System.out.println("Both Home costs are equal");
        }else {
            System.out.println("Home costs are not equal");
        }
    }
}
