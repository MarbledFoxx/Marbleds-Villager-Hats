package net.marblednull.marbledsvillagerhats.armor.farmers_hat;

import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.ArmorersGogglesArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.FarmersHatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FarmersHatModel extends GeoModel<FarmersHatArmorItem> {
    @Override
    public ResourceLocation getModelResource(FarmersHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "geo/farmers_hat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FarmersHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "textures/armor/farmers_hat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FarmersHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "animations/farmers_hat.animation.json");
    }
}
