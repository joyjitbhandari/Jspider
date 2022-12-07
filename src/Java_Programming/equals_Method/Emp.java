package Java_Programming.equals_Method;

public class Emp {

    String name;
    int id ;
    String grade;
    Emp(String name, int id, String grade){
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    public boolean equals(Object obj){
        Emp e = (Emp) obj;
        return this.id == e.id;
    }
    public static void main(String[] args) {
        Emp e1= new Emp("Ram",2525, "A");
        Emp e2= new Emp("Anuj",1505, "B");
        if(e1.equals(e2)){
            System.out.println("Employees ids are equal");
        }else {
            System.out.println("Employee ids are not equal");
        }
    }
}
