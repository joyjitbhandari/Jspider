package Inheritance;

public class ClassRoom_Main_Class {
    public static void main(String[] args) {
        Comic c= new Comic();
        Study s = new Study();
        Present p = new Present();
        Students.behave(c);
        Students.behave(s);
        Students.behave(p);
    }
}
interface ClassRoom{
    void environment();
}
class Comic implements ClassRoom{
    public void environment(){
        System.out.println("Comic book");
    }
}
class Study implements ClassRoom{
    public void environment(){
        System.out.println("Study book");
    }
}
class Present implements ClassRoom{
    public void environment(){
        System.out.println("Presentation  book");
    }
}
class Students{
    static void behave(ClassRoom cl){
        cl.environment();
    }
}