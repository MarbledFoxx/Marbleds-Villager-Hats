package net.marblednull.marbledsvillagerhats.armor.fletchers_hat;

import net.marblednull.marbledsvillagerhats.item.ArmorItem.FarmersHatArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.FletchersHatArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class FletchersHatRenderer extends GeoArmorRenderer<FletchersHatArmorItem> {
    public FletchersHatRenderer() {
        super(new FletchersHatModel());

    }
}
