package Pass_By_reference;
public class Post_Office {
    void letter(){
        System.out.println("Post");
    }
}
class Postman{
    public static void main (String[] args){
        Post_Office P = new Post_Office();
        Customer.needLetter(P);
    }
}
class Customer{
    static void needLetter( Post_Office P1 ){
        P1.letter();
    }
}
