package Structural_Design_Patterns.Decorator.Beverage;

public class Client {

    public static void main(String[] args) {

        Beverage b = new Espresso();
        b = new Mocha(b);
        b = new Whip(b);
        System.out.println(b.cost());
        System.out.println(b.getDescription());
    }
}
