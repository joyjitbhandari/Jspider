package Inheritance;
interface human{
    void Emotion();
}
class Angry implements human{
    public void Emotion(){
        System.out.println("Felling Angry");
    }
}
class Happy implements human {
   public void Emotion(){
        System.out.println("Felling Happy");
    }
}
class Sad implements human {
   public void Emotion(){
        System.out.println("Felling Sad");
    }
}

public class Human_Main_Class {
    public static void main(String[] args) {
        Angry a = new Angry();
        Happy ha = new Happy();
        Sad s = new Sad();
        Situation.behaviour(a);
        Situation.behaviour(ha);
        Situation.behaviour(s);
    }
}
class Situation {
    static void behaviour(human h){
        h.Emotion();
    }
}