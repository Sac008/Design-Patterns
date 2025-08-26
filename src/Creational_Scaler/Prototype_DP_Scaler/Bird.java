package Creational_Scaler.Prototype_DP_Scaler;

public class Bird implements Cloneable<Bird> {

    private String color;
    private int age;
    private int weight;

    public Bird(Bird b) {
        this.color = b.color;
        this.age = b.age;
        this.weight = b.weight;
    }

    public Bird(){}

    @Override
    public Bird clone() {
        return new Bird(this);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
