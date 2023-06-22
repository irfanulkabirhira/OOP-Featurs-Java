package OOp_Features.Polymorphism;

class person3 {
    void display() {
        System.out.println("I am a person");
    }
}

class Teacher3 extends person3 {
    @Override
    void display() {
        System.out.println("I am a teacher");
    }
}

class Student extends person3 {
    void display() {
        System.out.println("I am a stuent");
    }
}

public class poly1 {
    public static void main(String[] args) {
        person3 p = new person3();
        p.display();
        p = new Teacher3();
        p.display();
        p = new Student();
        p.display();
    }

}
