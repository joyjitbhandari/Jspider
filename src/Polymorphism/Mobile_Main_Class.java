package Polymorphism;
class Mobile{
    void operation(){
        System.out.println("No Operation");
    }
}
class Video extends Mobile{
    void operation(){
        System.out.println("Video playing");
    }
}
class Audio extends Mobile{
    void operation(){
        System.out.println("Audio playing");
    }
}
class Game extends Mobile{
    void operation(){
        System.out.println("Game playing");
    }
}
class User{
    static void usages(Mobile m){
        m.operation();
    }
}
public class Mobile_Main_Class {
    public static void main(String[] args) {
        Video v = new Video();
        Audio a = new Audio();
        Game g = new Game();
        User.usages(v);
        User.usages(a);
        User.usages(g);
    }
}
