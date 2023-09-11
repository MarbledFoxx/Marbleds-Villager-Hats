package net.marblednull.marbledsvillagerhats.armor.shephards_hat;

import net.marblednull.marbledsvillagerhats.item.ArmorItem.FletchersHatArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.ShepherdsHatArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ShepherdsHatRenderer extends GeoArmorRenderer<ShepherdsHatArmorItem> {
    public ShepherdsHatRenderer() {
        super(new ShepherdsHatModel());

    }
}
