package manuwar73.entities.bullet;

import arc.graphics.*;
import manuwar73.content.*;
import mindustry.graphics.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;

public class BasicBullet extends BulletType{
    public BasicBullet(float damage, Color color){
        super(speed, damage, sprite);
        hitColor = trailColor = color;
        this.speed = speed;
        lifetime = range / speed;
    }
    
    public BasicBullet(float damage){
        this(damage, damage, Pal.engine);
    }
}