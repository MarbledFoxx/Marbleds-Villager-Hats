package net.marblednull.marbledsvillagerhats.armor.librarians_hat;

import net.marblednull.marbledsvillagerhats.item.ArmorItem.LibrariansHatArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class LibrariansHatRenderer extends GeoArmorRenderer<LibrariansHatArmorItem> {
    public LibrariansHatRenderer() {
        super(new LibrariansHatModel());

    }
}
