package net.marblednull.marbledsvillagerhats.armor.witches_hat.purple;

import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.PurpleWitchesHatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PurpleWitchesHatModel extends GeoModel<PurpleWitchesHatArmorItem> {
    @Override
    public ResourceLocation getModelResource(PurpleWitchesHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "geo/purple_witches_hat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PurpleWitchesHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "textures/armor/purple_witches_hat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PurpleWitchesHatArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "animations/purple_witches_hat.animation.json");
    }
}
