package manuwar73.content;

import arc.graphics.Color;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import manuwar73.entities.bullet.*;
//import manuwar73.graphics.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;

import static mindustry.Vars.world;

public class remBullets{
    public static BulletType basicBullet;

    public static void load(){
basicBullet = new BasicBullet(50f){{
            hitColor = Pal.lancerLaser;
            trailSize = 8f;
            hitShake = 0f;
            speed = 5f;
            lifetime = 40f;
            
        }}
    }};