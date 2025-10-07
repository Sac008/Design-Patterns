package Structural_Design_Patterns.flyweight_dp.better_version;

import java.util.ArrayList;
import java.util.List;
import flyweight_dp.better_version.BulletType;

public class Client {

    public static void main(String[] args) {
        BulletRegistry bulletRegistry = new BulletRegistry();

        Bullet fiveMMBullet = new Bullet();
        fiveMMBullet.setBulletType(BulletType.FIVE_MM);
        bulletRegistry.registerBullet(BulletType.FIVE_MM , fiveMMBullet);

        Bullet sixMMBullet = new Bullet();
        sixMMBullet.setBulletType(BulletType.SIX_MM);
        bulletRegistry.registerBullet(BulletType.SIX_MM , sixMMBullet);

        Bullet nineMMBullet = new Bullet();
        nineMMBullet.setBulletType(BulletType.NINE_MM);
        bulletRegistry.registerBullet(BulletType.NINE_MM , nineMMBullet);

        List<FlyingBullet> flyingBullets = new ArrayList<>();

        for(int i = 0; i < 200000; i++) {
            FlyingBullet flyingBullet = new FlyingBullet();
            flyingBullet.setSpeed(120.);
            flyingBullet.setBullet(bulletRegistry.getBullet(BulletType.FIVE_MM));
            flyingBullets.add(flyingBullet);
        }

        System.out.println("DEMO");
    }
}
