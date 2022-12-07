package Polymorphism;
class Human{
    void Emotion(){
        System.out.println("Depends");
    }
}
class Angry extends Human{
    void Emotion(){
        System.out.println("Felling Angry");
    }
}
class Happy extends Human{
    void Emotion(){
        System.out.println("Felling Happy");
    }
}
class Sad extends Human{
    void Emotion(){
        System.out.println("Felling Sad");
    }
}
public class Human_Main_class {
    public static void main(String[] args) {
        Angry a = new Angry();
        Happy h = new Happy();
        Sad s = new Sad();
        Situation.behaviour(a);
        Situation.behaviour(h);
        Situation.behaviour(s);
    }
}
class Situation {
    static void behaviour(Human h){
        h.Emotion();
    }
}
