package net.marblednull.marbledsvillagerhats.armor.armorers_goggles;

import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.ArmorersGogglesArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ArmorersGogglesModel extends GeoModel<ArmorersGogglesArmorItem> {
    @Override
    public ResourceLocation getModelResource(ArmorersGogglesArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "geo/armorers_goggles.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ArmorersGogglesArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "textures/armor/armorers_goggles.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ArmorersGogglesArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "animations/armorers_goggles.animation.json");
    }
}
