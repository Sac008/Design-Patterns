package Structural_Design_Patterns.Decorator.CarAccesories.Accesories;

import Structural_Design_Patterns.Decorator.CarAccesories.Car;

public abstract class AccesoriesDecorator extends Car {

    Car car;
    public AccesoriesDecorator(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return "Accesories Decorator";
    }
}
