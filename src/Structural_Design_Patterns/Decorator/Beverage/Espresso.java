package Structural_Design_Patterns.Decorator.Beverage;

public class Espresso extends Beverage{

    String description = "Espresso";

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 1.5;
    }
}
