package net.marblednull.marbledsvillagerhats.armor.farmers_straw_hat;

import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.FarmersStrawHatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FarmersStrawHatModel extends GeoModel<FarmersStrawHatArmorItem> {
    @Override
    public ResourceLocation getModelResource(FarmersStrawHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "geo/farmers_straw_hat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FarmersStrawHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "textures/armor/farmers_straw_hat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FarmersStrawHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "animations/farmers_straw_hat.animation.json");
    }
}
