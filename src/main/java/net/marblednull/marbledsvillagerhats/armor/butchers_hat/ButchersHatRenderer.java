package net.marblednull.marbledsvillagerhats.armor.butchers_hat;

import net.marblednull.marbledsvillagerhats.item.ArmorItem.ButchersHatArmorItem;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.WeaponsmithsEyepatchArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ButchersHatRenderer extends GeoArmorRenderer<ButchersHatArmorItem> {
    public ButchersHatRenderer() {
        super(new ButchersHatModel());

    }
}
