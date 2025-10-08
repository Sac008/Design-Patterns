package Structural_Design_Patterns.flyweight_dp.better_version;

import java.util.HashMap;
import java.util.Map;
import flyweight_dp.better_version.BulletType;

public class BulletRegistry {
    private Map<BulletType, Bullet> bullets = new HashMap<>();

    public void registerBullet(BulletType type , Bullet bullet) {
        bullets.put(type , bullet);
    }

    public Bullet getBullet(BulletType bulletType) {
        return bullets.get(bulletType);
    }
}
