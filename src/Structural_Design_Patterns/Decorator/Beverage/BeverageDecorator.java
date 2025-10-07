package Structural_Design_Patterns.Decorator.Beverage;

public abstract class BeverageDecorator extends Beverage {

    Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return "Abstract Decorator";
    }
}
