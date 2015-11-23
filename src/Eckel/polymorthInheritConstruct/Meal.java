package Eckel.polymorthInheritConstruct;

/**
 * Created by GEO on 05.11.15.
 */
class Meal {
    Meal() {
        System.out.println("Consruct: Meal()");
    }
}

class Bread{
    public Bread() {
        System.out.println("Consruct: Bread()");
    }
}

class Letuce{
    public Letuce() {
        System.out.println("Consruct: Lettuce()");
    }
}

class Cheese{
    public Cheese() {
        System.out.println("Consruct: Cheese()");
    }
}

class Lunch extends Meal{
    public Lunch() {
        System.out.println("Consruct: Lunch()");
    }
}

class PortableLunch extends Lunch{
    public PortableLunch() {
        System.out.println("Consruct: PortableLunch");
    }
}