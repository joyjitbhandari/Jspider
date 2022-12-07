package Inheritance;
interface Bottle{
   void store();
}
class Water implements Bottle{
   public void store(){
        System.out.println("Stored water");
    }
}
class Milk implements Bottle{
   public void store(){
        System.out.println("Stored Milk");
    }
}
class Juice implements Bottle{
   public void store(){
        System.out.println("Stored Juice");
    }
}

class StoringType{
    static void use( Bottle b){
        b.store();
    }
}
public class Bottle_Main_Class {
    public static void main(String[] args) {
        Water w = new Water();
        Milk m = new Milk();
        Juice j = new Juice();
        StoringType.use(w);
        StoringType.use(m);
        StoringType.use(j);
    }
}
