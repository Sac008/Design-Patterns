package Structural_Design_Patterns.Decorator.CarAccesories;

public class BaseModel extends Car{

    public String getDescription() {
        return "This is Base Model of Car";
    }

    public double cost() {
        return 70;
    }
}
