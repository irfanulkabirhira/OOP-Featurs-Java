package OOp_Features.INHERITANCE;

class person {
    String name;
    int age;

    void displayInforamtion1() {
        System.out.println("name :" + name);
        System.out.println("Age :" + age);
    }
}

class Teacher extends person {
    // name, age display informaton
    String Qualification;

    void displayInformation2() {
        displayInforamtion1();
        System.out.println("Qualificaton :" + Qualification);
    }
}

public class First {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Hira";
        t1.age = 23;
        t1.Qualification = "B.Sc";
        t1.displayInformation2();
        System.out.println("\n");

        Teacher t2 = new Teacher();
        t2.name = "Iira";
        t2.age = 17;
        t2.Qualification = "M.Sc";
        t2.displayInformation2();
    }

}
