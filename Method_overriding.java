package OOp_Features.INHERITANCE;

class person4 {
    String name;
    int age;

    void displayInformaton() {
        System.out.println("Name" + name);
        System.out.println("age" + age);
    }
}

class teacher4 extends person4 {
    String qualification;

    @Override
    void displayInformaton() {
        System.out.println("Name " + name);
        System.out.println("age " + age);
        System.out.println("Qualification " + qualification);
    }
}

public class Method_overriding {
    public static void main(String[] args) {
        teacher4 t1 = new teacher4();
        t1.name = "Hira";
        t1.age = 23;
        t1.qualification = "B.Sc";
        t1.displayInformaton();

    }

}
