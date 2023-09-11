package net.marblednull.marbledsvillagerhats.armor.farmers_hat;

import net.marblednull.marbledsvillagerhats.item.ArmorItem.ArmorersGogglesArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.FarmersHatArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class FarmersHatRenderer extends GeoArmorRenderer<FarmersHatArmorItem> {
    public FarmersHatRenderer() {
        super(new FarmersHatModel());

    }
}
