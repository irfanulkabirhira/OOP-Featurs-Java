package OOp_Features.Encapsulation;

class nira {
    private String name;
    private int age;

    // access modifer
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class Encapsulation1 {
    public static void main(String[] args) {
        nira n1 = new nira();
        n1.setName("Anis");
        n1.setAge(23);
        System.out.println(n1.getName());
        System.out.println(n1.getAge());

    }

}
