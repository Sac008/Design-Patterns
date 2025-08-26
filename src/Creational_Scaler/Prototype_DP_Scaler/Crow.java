package Creational_Scaler.Prototype_DP_Scaler;

public class Crow extends Bird{

    private String sound = "Kaw";

    public Crow(Crow c){
        super(c);
        this.sound = c.sound;
    }

    public Crow(){}

    @Override
    public Crow clone() {
        return new Crow(this);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
