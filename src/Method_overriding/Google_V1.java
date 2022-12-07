package Method_overriding;

public class Google_V1 {
    void search(){
        System.out.println("Search by text typing");
    }
}
class Google_V2 extends Google_V1 {
    void search(){
        System.out.println("Search by voice typing");
    }
}
class MainClass{
    public static void main(String[] args){
        Google_V2 v2= new Google_V2();
        v2.search();
    }
}