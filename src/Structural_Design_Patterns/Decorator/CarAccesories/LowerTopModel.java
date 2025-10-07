package Structural_Design_Patterns.Decorator.CarAccesories;

public class LowerTopModel extends Car{

    public String getDescription() {
        return "This is Lower Top Model";
    }

    public double cost() {
        return 90;
    }
}
