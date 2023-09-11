package net.marblednull.marbledsvillagerhats.armor.fishermans_hat;

import net.marblednull.marbledsvillagerhats.item.ArmorItem.FishermansHatArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.FletchersHatArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class FishermansHatRenderer extends GeoArmorRenderer<FishermansHatArmorItem> {
    public FishermansHatRenderer() {
        super(new FishermansHatModel());

    }
}
