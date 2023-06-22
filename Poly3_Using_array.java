package OOp_Features.Polymorphism;

// super class,we don't use super class
// genually we extend super class  
class shape {
    double area() {
        System.out.println("Shape area ");
        return 0;
    }
}

class rectangle extends shape {
    // area
    double lentgh, width;

    // constructor ,for initializing the rectangle
    rectangle(double lentgh, double width) {
        this.lentgh = lentgh;
        this.width = width;
    }

    // overridding area ,return korteci
    double area() {
        System.out.println("Area for rectangle");
        return lentgh * width;
    }
}

class triangle extends shape {
    double base, height;

    triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // over ride method
    double area() {
        System.out.println("area for triangle ");
        return 0.5 * base * height;
    }

}

public class Poly3_Using_array {
    public static void main(String[] args) {
        /*
         * shape s1 = new shape();
         * shape s2 = new rectangle(10, 20);
         * shape s3 = new triangle(10, 20);
         * System.out.println(s1.area());
         * System.out.println(s2.area());
         * System.out.println(s3.area());
         */
        // Using array
        shape[] s = new shape[3];
        s[0] = new shape();
        s[1] = new rectangle(10, 20);
        s[2] = new triangle(20, 30);

        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].area());
        }

    }
}
