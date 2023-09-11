package net.marblednull.marbledsvillagerhats.armor.weaponsmiths_eyepatch;

import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.LibrariansHatArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.WeaponsmithsEyepatchArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WeaponsmithsEyepatchModel extends GeoModel<WeaponsmithsEyepatchArmorItem> {
    @Override
    public ResourceLocation getModelResource(WeaponsmithsEyepatchArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "geo/weaponsmiths_eyepatch.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WeaponsmithsEyepatchArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "textures/armor/weaponsmiths_eyepatch.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WeaponsmithsEyepatchArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "animations/weaponsmiths_eyepatch.animation.json");
    }
}
