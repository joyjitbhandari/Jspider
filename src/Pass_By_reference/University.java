package Pass_By_reference;

public class University {
    void exam(){
        System.out.println("EXam Scheduled");
    }
}

class College {
    public static void main(String[] args){
        University U = new University();
        Students.needExam(U);
    }
}

class Students {
    static void needExam(University U1){
        U1.exam();
    }
}
