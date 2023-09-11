package net.marblednull.marbledsvillagerhats.armor.cartographers_monocle;

import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.ButchersHatArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.CartographersMonocleArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CartographersMonocleModel extends GeoModel<CartographersMonocleArmorItem> {
    @Override
    public ResourceLocation getModelResource(CartographersMonocleArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "geo/cartographers_monocle.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CartographersMonocleArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "textures/armor/cartographers_monocle.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CartographersMonocleArmorItem animatable) {
        return new ResourceLocation(MarbledsVillagerHats.MOD_ID, "animations/cartographers_monocle.animation.json");
    }
}
