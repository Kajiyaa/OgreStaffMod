package net.apollo.ogreclubmod.item;

import net.apollo.ogreclubmod.OgreClubMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OgreClubMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> OGRE_WEAPONS = CREATIVE_MODE_TABS.register("ogre_weapons",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.FOUL_FANG.get()))
                    .title(Component.translatable("creativetab.ogre_weapons"))
                    .displayItems((pParameters, pOutput) ->{
                        pOutput.accept(ModItems.FOUL_FANG.get());
                        pOutput.accept(ModItems.FANG_SHARD.get());
                        pOutput.accept(ModItems.OGRE_CLUB.get());
                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
