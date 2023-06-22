package OOp_Features.Abstraction;

// super class 
// this is 100% abstract 
abstract class MobileUder {
    abstract void sendDM(); // abstrat method, there is no body of this
}

class Rahim extends MobileUder {
    @Override
    void sendDM() {
        System.out.println("I am Rahim");
    }
}

class Karim extends MobileUder {
    @Override
    void sendDM() {
        System.out.println("I am karim ");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        // There is no need need too creat an object of an abstruct class
        MobileUder mu; // referance variable
        mu = new Rahim();
        mu.sendDM();

        mu = new Karim();
        mu.sendDM();
    }

}
