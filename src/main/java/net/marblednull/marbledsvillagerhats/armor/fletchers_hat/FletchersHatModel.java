package net.marblednull.marbledsvillagerhats.armor.fletchers_hat;

import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.FarmersHatArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.FletchersHatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FletchersHatModel extends GeoModel<FletchersHatArmorItem> {
    @Override
    public ResourceLocation getModelResource(FletchersHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "geo/fletchers_hat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FletchersHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "textures/armor/fletchers_hat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FletchersHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "animations/fletchers_hat.animation.json");
    }
}
