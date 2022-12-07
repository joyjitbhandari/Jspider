package ToString_Method;

public class Course {
    String name;
    String uni;
    int fee;
    Course(String name, String uni,  int fee){
        this.name = name;
        this.uni = uni;
        this.fee = fee;
    }
    public String toString(){
        return "Course Name:- "+this.name+", University:- "+this.uni+", Total fees:- "+this.fee;
    }

    public static void main(String[] args) {
        Course c = new Course("Java","Jspider",36000);
        System.out.println(c.toString());
        Course c1 = new Course("Manual Testing","Qspider",36000);
        System.out.println(c1.toString());
    }
}
