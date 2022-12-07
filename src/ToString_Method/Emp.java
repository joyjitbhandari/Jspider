package ToString_Method;

public class Emp {

    String name;
    int id ;
    String grade;
    Emp(String name, int id, String grade){
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    public String toString(){
        return "Emp Name:- "+this.name+", Id:- "+this.id+", Grade:- "+this.grade;
    }

    public static void main(String[] args) {
        Emp e= new Emp("Ram",2525, "A");
        System.out.println(e.toString());
        Emp e1= new Emp("Anuj",1505, "B");
        System.out.println(e1.toString());
    }
}
