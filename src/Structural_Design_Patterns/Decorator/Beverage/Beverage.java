package Structural_Design_Patterns.Decorator.Beverage;

public abstract class Beverage {

    String description = "Abstract Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
