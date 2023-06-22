package OOp_Features.Polymorphism;

// polyMorpysm czzz add merhod er multiple form
class overload {
    void add(double a, double b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add() {
        System.out.println("Nothing is added");

    }
}

public class Over_loading_poly {
    public static void main(String[] args) {
        overload ob = new overload();
        ob.add();
        ob.add(6.5, 5.5);
        ob.add(5, 10, 20);

    }
}
