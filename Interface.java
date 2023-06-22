package OOp_Features.Abstraction;

interface animal {
    public abstract void eat();
}

class dog implements animal {
    public void eat() {
        System.out.println("Dog can eat");
    }
}

public class Interface {
    public static void main(String[] args) {
        dog s = new dog();
        s.eat();
        // animal er object creat kora jabe nah
        // czzz animal is an interface
    }

}
