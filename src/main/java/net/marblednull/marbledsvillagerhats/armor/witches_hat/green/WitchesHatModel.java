package net.marblednull.marbledsvillagerhats.armor.witches_hat.green;

import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.FletchersHatArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.WitchesHatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WitchesHatModel extends GeoModel<WitchesHatArmorItem> {
    @Override
    public ResourceLocation getModelResource(WitchesHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "geo/witches_hat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WitchesHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "textures/armor/witches_hat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WitchesHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "animations/witches_hat.animation.json");
    }
}
