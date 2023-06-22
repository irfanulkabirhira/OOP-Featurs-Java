package OOp_Features.Polymorphism;

class Person8 {
    String name;
    int age;

    void display() {
        System.out.println("name " + name);
        System.out.println("age " + age);
    }
}

class Teacher extends Person8 {
    String qualification;

    @Override
    void display() {
        System.out.println("qualification " + qualification);
    }
}

public class Over_ridding_poly {
    public static void main(String[] args) {
        Person8 p = new Person8(); // super class er object
        p.display();
        Person8 t = new Teacher(); // subclass er object
        t.display();
    }
}
