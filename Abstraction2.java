package OOp_Features.Abstraction;

// super class 
// this is not 100% abstract czz in abstact method, there is non abstract method
abstract class MobileUser {
    abstract void sendDM(); // abstrat method

    void cell()// non abstract method
    {
        System.out.println("call method");
    }
}

class Rahim1 extends MobileUser {
    // call , sendDM method inherite korlam
    @Override
    void sendDM() {
        System.out.println("I am Rahim");
    }
}

class Karim1 extends MobileUser {
    // call method and sendDM
    @Override
    void sendDM() {
        System.out.println("I am karim ");
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        // abstract class er object create kote parbo na
        MobileUser mu; // referance variable
        mu = new Rahim1();
        mu.cell();
        mu.sendDM();

        mu = new Karim1();
        mu.sendDM();
    }

}
