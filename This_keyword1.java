package OOp_Features.INHERITANCE;

// Refering current class instance variable by this keyword
class hira {
    String name;
    int age;

    hira(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name " + name);
        System.out.println("age " + age);
    }
}

public class This_keyword1 {
    public static void main(String[] args) {

        hira h = new hira("anis", 23);
        h.display();
    }
}
