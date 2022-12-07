package Method_Overloading;
public class Irctc {
    static void search(int Num){
        System.out.println("Train search by "+ Num);
    }
    static void search(String Name){
        System.out.println("Train search by " +Name );
    }
    static void search(int Num, String Name){
        System.out.println("Train search by "+Num+"and "+Name);
    }
    static void search(String Name, int Num){
        System.out.println("Train search by "+Name+"and "+Num);
    }
}
class main{
    public static void main(String[] args){
        Irctc.search(12853);
        Irctc.search("Rajdhani");
        Irctc.search(10258,"Vivek Exp");
        Irctc.search("Vestadom",45050);
    }
}
