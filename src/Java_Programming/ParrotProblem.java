package Java_Programming;

public class ParrotProblem {
    public static void main(String[] args) {
        System.out.println(talking_parrot(true,6));
        System.out.println(talking_parrot(true,7));
        System.out.println(talking_parrot(false,6));
    }
    static boolean talking_parrot(boolean talking,int hour ){
        if(talking && hour<24){
            return hour < 7 || hour > 20 ;
        }else{
            return false ;
        }
    }
}
