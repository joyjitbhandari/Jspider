package Polymorphism;

import Java_Programming.StrongNum;

class Bottle{
    void store(){
        System.out.println("Store Nothing");
    }
}
class Water extends Bottle{
    void store(){
        System.out.println("Stored water");
    }
}
class Milk extends Bottle{
    void store(){
        System.out.println("Stored Milk");
    }
}
class Juice extends Bottle{
    void store(){
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

