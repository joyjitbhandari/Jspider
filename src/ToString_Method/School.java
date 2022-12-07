package ToString_Method;

public class School {
    int strength ;
    String name;
    String grade;
    School(String name, String grade,  int strength){
        this.name = name;
        this.grade = grade;
        this.strength = strength;
    }
    public String toString(){
        return "School Name:- "+this.name+", Grade:- "+this.grade+", Total Strength:- "+this.strength;
    }

    public static void main(String[] args) {
        School s = new School("DAV Public School","A",3000);
        System.out.println(s.toString());
        School s1 = new School("Chousal High School","A",2000);
        System.out.println(s1.toString());
    }
}
