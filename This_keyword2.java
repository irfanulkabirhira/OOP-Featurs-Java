package OOp_Features.INHERITANCE;

// Refering current class object by this keyword
class mira {
    String name;
    int age;
    String haircolor;

    mira(String name, int age) {
        this.name = name;
        this.age = age;
    }

    mira(String name, int age, String haircolor) {
        this(name, age); // passing name age in constructor by this keyword
        this.haircolor = haircolor;
    }

    void display() {
        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("haircolor " + haircolor);
    }

}

public class This_keyword2 {
    public static void main(String[] args) {
        mira m1 = new mira("Hira", 23, "white");
        m1.display();

    }

}
