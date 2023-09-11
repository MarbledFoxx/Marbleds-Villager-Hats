package net.marblednull.marbledsvillagerhats.armor.shephards_hat;

import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.FletchersHatArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.ShepherdsHatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ShepherdsHatModel extends GeoModel<ShepherdsHatArmorItem> {
    @Override
    public ResourceLocation getModelResource(ShepherdsHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "geo/shepherds_hat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ShepherdsHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "textures/armor/shepherds_hat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ShepherdsHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "animations/shepherds_hat.animation.json");
    }
}
