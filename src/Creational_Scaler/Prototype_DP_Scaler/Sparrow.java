package Creational_Scaler.Prototype_DP_Scaler;

public class Sparrow extends Bird{

    public Sparrow(Sparrow s) {
        super(s);
    }

    public Sparrow() {}

    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }
}