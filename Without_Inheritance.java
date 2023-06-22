package OOp_Features.INHERITANCE;

class person1 {
    String name;
    int age;

    void displayInformation1() {
        System.out.println("name :" + name);
        System.out.println("Age :" + age);
    }
}

class teacher1 {
    String name;
    int age;
    String Qualification;

    void displayInformation2() {
        System.out.println("name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Qualificaton :" + Qualification);
    }

}

public class Without_Inheritance {
    public static void main(String[] args) {
        teacher1 t1 = new teacher1();
        t1.name = "Hira";
        t1.age = 30;
        t1.Qualification = "BS.c";
        t1.displayInformation2();
        System.out.println("\n");

        Teacher t2 = new Teacher();
        t2.name = "mira";
        t2.age = 17;
        t2.Qualification = "M.Sc";

        t2.displayInformation2();

    }
}
