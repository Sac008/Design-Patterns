package Structural_Design_Patterns.Decorator.CarAccesories.Accesories;

import Structural_Design_Patterns.Decorator.CarAccesories.Car;

public class AlloyWheels extends AccesoriesDecorator {

    public AlloyWheels(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " Alloy Wheels added";
    }

    public double cost() {
        return car.cost() + 5;
    }
}
 