package net.marblednull.marbledsvillagerhats.armor.cartographers_monocle;

import net.marblednull.marbledsvillagerhats.item.ArmorItem.ButchersHatArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.CartographersMonocleArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CartographersMonocleRenderer extends GeoArmorRenderer<CartographersMonocleArmorItem> {
    public CartographersMonocleRenderer() {
        super(new CartographersMonocleModel());

    }
}
