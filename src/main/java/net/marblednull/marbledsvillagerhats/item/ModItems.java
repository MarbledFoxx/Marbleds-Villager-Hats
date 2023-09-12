package net.marblednull.marbledsvillagerhats.item;
import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.marblednull.marbledsvillagerhats.item.ArmorItem.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MarbledsVillagerHats.MOD_ID);
public static final RegistryObject<Item> ARMORERS_GOGGLES = ITEMS.register("armorers_goggles",
        () -> new ArmorersGogglesArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                new Item.Properties()));
public static final RegistryObject<Item> BUTCHERS_HAT = ITEMS.register("butchers_hat",
        () -> new ButchersHatArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                new Item.Properties()));
public static final RegistryObject<Item> CARTOGRAPHERS_MONOCLE = ITEMS.register("cartographers_monocle",
        () -> new CartographersMonocleArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                new Item.Properties()));

public static final RegistryObject<Item> FISHERMANS_HAT = ITEMS.register("fishermans_hat",
        () -> new FishermansHatArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                new Item.Properties()));

public static final RegistryObject<Item> FLETCHERS_HAT = ITEMS.register("fletchers_hat",
        () -> new FletchersHatArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                new Item.Properties()));

public static final RegistryObject<Item> LIBRARIANS_HAT = ITEMS.register("librarians_hat",
        () -> new LibrariansHatArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                new Item.Properties()));

public static final RegistryObject<Item> FARMERS_STRAW_HAT = ITEMS.register("farmers_straw_hat",
        () -> new FarmersStrawHatArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                new Item.Properties()));

public static final RegistryObject<Item> WEAPONSMITHS_EYEPATCH = ITEMS.register("weaponsmiths_eyepatch",
        () -> new WeaponsmithsEyepatchArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                new Item.Properties()));

public static final RegistryObject<Item> SHEPHERDS_HAT = ITEMS.register("shepherds_hat",
        () -> new ShepherdsHatArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                new Item.Properties()));
public static final RegistryObject<Item> WITCHES_HAT = ITEMS.register("witches_hat",
        () -> new WitchesHatArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                new Item.Properties()));
public static final RegistryObject<Item> PURPLE_WITCHES_HAT = ITEMS.register("purple_witches_hat",
        () -> new PurpleWitchesHatArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,
                new Item.Properties()));

public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}