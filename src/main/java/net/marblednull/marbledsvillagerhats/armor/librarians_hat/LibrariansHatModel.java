package net.marblednull.marbledsvillagerhats.armor.librarians_hat;

import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.FarmersHatArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.LibrariansHatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class LibrariansHatModel extends GeoModel<LibrariansHatArmorItem> {
    @Override
    public ResourceLocation getModelResource(LibrariansHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "geo/librarians_hat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LibrariansHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "textures/armor/librarians_hat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LibrariansHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "animations/librarians_hat.animation.json");
    }
}
