package Structural_Design_Patterns.Decorator.Beverage;

public class Whip extends BeverageDecorator{

    public Whip(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + 0.1;
    }
}
