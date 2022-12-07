package Java_Programming;

class Animal{
    void noise(){
        System.out.println("some noise");
    }
}
class Dog extends Animal {
    void noise(){
        System.out.println("boww");
    }
}
class Cat extends Animal{
    void noise(){
        System.out.println("Meow");
    }
}
class Snake extends Animal {
    void noise(){
        System.out.println("busss");
    }
}

class Simulator{
    static void animalSound( Animal a1){
        a1.noise();
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Snake s1 = new Snake();
        Simulator.animalSound(d1);
        Simulator.animalSound(c1);
        Simulator.animalSound(s1);
    }
}
