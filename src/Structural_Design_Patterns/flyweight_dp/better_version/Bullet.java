package Structural_Design_Patterns.flyweight_dp.better_version;

import flyweight_dp.better_version.BulletType;

public class Bullet {
    private double radius;
    private double weight;
    private BulletType bulletType;
    private byte[] image;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public flyweight_dp.better_version.BulletType getBulletType() {
        return bulletType;
    }

    public void setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
