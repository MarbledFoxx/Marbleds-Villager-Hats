package net.marblednull.marbledsvillagerhats.armor.armorers_goggles;

import net.marblednull.marbledsvillagerhats.item.ArmorItem.ArmorersGogglesArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ArmorersGogglesRenderer extends GeoArmorRenderer<ArmorersGogglesArmorItem> {
    public ArmorersGogglesRenderer() {
        super(new ArmorersGogglesModel());

    }
}
