package Structural_Design_Patterns.Decorator.CarAccesories;

import Structural_Design_Patterns.Decorator.CarAccesories.Accesories.AlloyWheels;
import Structural_Design_Patterns.Decorator.CarAccesories.Accesories.PremiumInsurance;

public class Client {

    public static void main(String[] args) {
        Car car = new BaseModel();
        car = new PremiumInsurance(car);
        System.out.println(car.getDescription());
        System.out.println(car.cost());

        car = new AlloyWheels(car);
        System.out.println(car.getDescription());
        System.out.println(car.cost());
    }

}
