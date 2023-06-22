package OOp_Features.INHERITANCE;

class person3 {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Teacher3 extends person3 {
    String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    void displayInformation() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
        System.out.println("\n");
    }
}

public class Inheritance_private_member_access_by_creating_method {
    public static void main(String[] args) {
        Teacher3 t1 = new Teacher3();
        t1.setName("Hira");
        t1.setAge(23);
        t1.setQualification("B.Sc");
        t1.displayInformation();

        Teacher3 t2 = new Teacher3();
        t2.setName("Jira");
        t2.setAge(21);
        t2.setQualification("SSC");
        t2.displayInformation();
    }
}
