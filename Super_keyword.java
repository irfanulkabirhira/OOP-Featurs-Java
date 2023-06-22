package OOp_Features.INHERITANCE;

//Super class Instance variable
class person5 {
    int x = 10;// instance variable
}

class teacher5 extends person5 {
    int x = 15;// instance variable

    void display() {
        System.out.println(super.x);
    }
}

public class Super_keyword {

    public static void main(String[] args) {
        teacher5 ob = new teacher5();
        ob.display();

    }
}
