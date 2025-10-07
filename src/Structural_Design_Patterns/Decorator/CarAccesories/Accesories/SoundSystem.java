package Structural_Design_Patterns.Decorator.CarAccesories.Accesories;

import Structural_Design_Patterns.Decorator.CarAccesories.Car;

public class SoundSystem extends AccesoriesDecorator {

    public SoundSystem(Car car) {
        super(car);
    }

    public String getDescription() {
        return car.getDescription() + " sound system added";
    }

    public double cost() {
        return car.cost() + 2;
    }
}
