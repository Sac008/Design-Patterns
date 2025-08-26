package Creational_Scaler.Prototype_DP_Scaler;

public class Pigeon extends Bird{

    public Pigeon(Pigeon p){
        super(p);
    }

    public Pigeon(){}

    @Override
    public Pigeon clone() {
        return new Pigeon(this);
    }
}
