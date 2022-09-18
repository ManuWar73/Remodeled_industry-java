package remodeledindustry.entities.bullet;

import mindustry.entities.bullet.BulletType;

public class BasicBullet extends BulletType {
    //if true range will not be initialized in init
    public boolean overrideRange = false;

    @Override
    public void init() {
        float irange = range;
        super.init();
        if(overrideRange) range = irange;
    }
}