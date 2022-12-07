package Java_Programming.equals_Method;

public class School {
    int strength ;
    String name;
    String grade;
    School(String name, String grade,  int strength){
        this.name = name;
        this.grade = grade;
        this.strength = strength;
    }
    public boolean equals(Object obj){
        School s = (School)obj;
        return this.grade == s.grade;
    }

    public static void main(String[] args) {
        School s1 = new School("DAV Public School","A",3000);
        School s2 = new School("Chousal High School","A",2000);
        if(s1.equals(s2)){
            System.out.println("Both Bike costs are equal");
        }else {
            System.out.println("Bike costs are not equal");
        }
    }
}
