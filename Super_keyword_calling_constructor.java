package OOp_Features.INHERITANCE;

//Super class constructor
class A {
    A() {
        System.out.println("A is constructor");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("B  is constructor");
    }
}

public class Super_keyword_calling_constructor {
    public static void main(String[] args) {
        new B();

    }

}
