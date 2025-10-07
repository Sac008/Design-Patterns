package Structural_Design_Patterns.Decorator.CarAccesories;

public class TopModel extends Car{

    public String getDescription() {
        return "This is Top model of car";
    }

    public double cost() {
        return 100;
    }
}
