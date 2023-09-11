package net.marblednull.marbledsvillagerhats.armor.butchers_hat;

import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.ButchersHatArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.WeaponsmithsEyepatchArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ButchersHatModel extends GeoModel<ButchersHatArmorItem> {
    @Override
    public ResourceLocation getModelResource(ButchersHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "geo/butchers_hat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ButchersHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "textures/armor/butchers_hat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ButchersHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "animations/butchers_hat.animation.json");
    }
}
