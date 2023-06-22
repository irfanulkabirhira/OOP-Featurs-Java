package OOp_Features.INHERITANCE;

import java.util.function.DoubleToIntFunction;

class vheicle {
    String color; // Instance variable
    double weight; // Instance variable

    vheicle(String c, double w) // local variabvle
    {
        color = c; // local variabvle
        weight = w;
    }

    void attribute() {
        System.out.println("color :" + color);
        System.out.println("weight :" + weight);
    }
}

class car extends vheicle {
    // color weight and attribute
    int gear;

    car(String c, double w, int g) {
        // super class er construtor call dea always dirst line a hote hobe
        super(c, w); // calling the constructor of vehicle class
        gear = g;
    }

    @Override
    void attribute() {
        super.attribute();// calling attribute method
        System.out.println("gear " + gear);
    }
}

public class Super3_keyWord {
    public static void main(String[] args) {
        car car1 = new car("white", 350, 5); // creating object
        car1.attribute();
    }
}
