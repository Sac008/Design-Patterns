package Structural_Design_Patterns.Decorator.CarAccesories.Accesories;

import Structural_Design_Patterns.Decorator.CarAccesories.Car;

public class PremiumInsurance extends AccesoriesDecorator{

    public PremiumInsurance(Car car) {
        super(car);
    }

    public String getDescription() {
        return car.getDescription() + " premium insurance taken";
    }

    public double cost() {
        return car.cost() + 3;
    }
}
