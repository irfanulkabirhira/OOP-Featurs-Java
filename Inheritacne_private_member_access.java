package OOp_Features.INHERITANCE;

class person2 {
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

class Teacher2 extends person2 {
    String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}

public class Inheritacne_private_member_access {
    public static void main(String[] args) {
        Teacher2 t1 = new Teacher2();
        t1.setName("Hira");
        t1.setAge(23);
        t1.setQualification("B.Sc");
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getQualification());
    }
}
