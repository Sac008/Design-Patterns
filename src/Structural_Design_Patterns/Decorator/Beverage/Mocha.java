package Structural_Design_Patterns.Decorator.Beverage;

public class Mocha extends BeverageDecorator{

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + "  Mocha added";
    }

    public double cost() {
        return beverage.cost() + 1.0;
    }
}
