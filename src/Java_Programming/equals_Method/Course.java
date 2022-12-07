package Java_Programming.equals_Method;

public class Course {
    String name;
    String uni;
    int fee;
    Course(String name, String uni,  int fee){
        this.name = name;
        this.uni = uni;
        this.fee = fee;
    }
    public boolean equals(Object obj){
        Course c = (Course) obj;
        return this.uni == c.uni;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java","Jspider",36000);
        Course c2 = new Course("Manual Testing","Qspider",36000);
        if(c1.equals(c2)){
            System.out.println("Universities  are equal");
        }else {
            System.out.println("Universities are not equal");
        }
    }
}
