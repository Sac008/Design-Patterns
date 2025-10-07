package Structural_Design_Patterns.Decorator.CarAccesories;

public abstract class Car {

    String description = "General Car";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
