package Structural_Design_Patterns.Decorator.Beverage;

public class DarkRoast extends Beverage{

    String description = "Dark Roast";

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 2.0;
    }
}
