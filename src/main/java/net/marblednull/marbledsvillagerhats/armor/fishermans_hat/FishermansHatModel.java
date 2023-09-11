package net.marblednull.marbledsvillagerhats.armor.fishermans_hat;

import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.FishermansHatArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.FletchersHatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FishermansHatModel extends GeoModel<FishermansHatArmorItem> {
    @Override
    public ResourceLocation getModelResource(FishermansHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "geo/fishermans_hat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FishermansHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "textures/armor/fishermans_hat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FishermansHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "animations/fishermans_hat.animation.json");
    }
}
