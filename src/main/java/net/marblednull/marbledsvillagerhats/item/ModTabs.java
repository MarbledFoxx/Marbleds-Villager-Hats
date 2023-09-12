package net.marblednull.marbledsvillagerhats.item;



import net.marblednull.marbledsvillagerhats.MarbledsVillagerHats;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MarbledsVillagerHats.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MARBLEDS_ARSENAL = TABS.register("marbleds_villager_hats",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.marbleds_villager_hats"))
                    .icon(() -> new ItemStack(ModItems.FARMERS_STRAW_HAT.get()))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.FARMERS_STRAW_HAT.get());
                        output.accept(ModItems.ARMORERS_GOGGLES.get());
                        output.accept(ModItems.BUTCHERS_HAT.get());
                        output.accept(ModItems.FISHERMANS_HAT.get());
                        output.accept(ModItems.CARTOGRAPHERS_MONOCLE.get());
                        output.accept(ModItems.FLETCHERS_HAT.get());
                        output.accept(ModItems.LIBRARIANS_HAT.get());
                        output.accept(ModItems.SHEPHERDS_HAT.get());
                        output.accept(ModItems.WEAPONSMITHS_EYEPATCH.get());
                        output.accept(ModItems.WITCHES_HAT.get());
                    })
                    .build()
    );

}
