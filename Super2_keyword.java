package OOp_Features.INHERITANCE;

//Super Clas method
class L {
    void display() {
        System.out.println("Inside A class");
    }
}

class Z extends L {
    @Override
    void display() {
        super.display();
        System.out.println("Inside B class");
    }
}

public class Super2_keyword {
    public static void main(String[] args) {
        Z ob = new Z();
        ob.display();
    }

}
