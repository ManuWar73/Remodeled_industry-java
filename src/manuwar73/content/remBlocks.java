package manuwar73.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import arc.util.*;
import manuwar73.entities.bullet.*;
import manuwar73.content.*;
//import manuwar73.graphics.*;
//import manuwar73.type.*;
//import manuwar73.world.blocks.campaign.*;
//import manuwar73.world.blocks.defense.*;
//import manuwar73.world.blocks.defense.turrets.*;
//import manuwar73.world.blocks.defense.turrets.pattern.*;
//import manuwar73.world.blocks.distribution.*;
//import manuwar73.world.blocks.environment.*;
//import manuwar73.world.blocks.logic.*;
//import manuwar73.world.blocks.payloads.*;
//import manuwar73.world.blocks.power.*;
//import manuwar73.world.blocks.production.*;
//import manuwar73.world.blocks.storage.*;
//import manuwar73.world.blocks.units.*;
//import manuwar73.world.draw.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.effect.*;
import mindustry.entities.pattern.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import static mindustry.type.ItemStack.*;
@SuppressWarnings("deprecation")
public class remBlocks{
    //turrets
    public static Block puncher, test;

public static void load() {
  puncher = new ItemTurret("puncher"){{
 requirements(Category.turret, with(Items.lead, 80, Items.graphite, 65, Items.titanium, 50));

 reload = 1f;
            range = 240f;
            recoil = 2f;
            size = 6;
            shoot.shots = 2;
            shoot.shotDelay = 1f;
            health = 140 * size * size;
            shootY = 2f;
            coolant = consume(consumeCoolant(1f));
            coolantMultiplier = 0.4f;
            shoot = new ShootAlternate(3.5f);

            shootY = 3f;
            reload = 20f;
            range = 200;
            shootCone = 15f;
            ammoUseEffect = Fx.casing1;
            health = 250;
            inaccuracy = 0f;
            rotateSpeed = 10f;
            coolant = consumeCoolant(0.1f);

             ammo(
                Items.surgeAlloy, new basicBullet(50f){{
                    ammoMultiplier = 5f;
                    collidesGround = false;
                }}
            );
  }};
  }};