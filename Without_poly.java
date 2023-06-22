package OOp_Features.Polymorphism;

class A {
    void display() {
        System.out.println("Hira");
    }
}

public class Without_poly {
    public static void main(String[] args) {
        A ob1 = new A();
        A ob2 = new A();
        A ob3 = new A();
        ob1.display();
        ob2.display();
        ob3.display();

    }
}
