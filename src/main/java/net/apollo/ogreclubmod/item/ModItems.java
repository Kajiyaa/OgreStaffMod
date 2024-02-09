package net.apollo.ogreclubmod.item;

import net.apollo.ogreclubmod.OgreClubMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OgreClubMod.MOD_ID);

    public static final RegistryObject<Item> FOUL_FANG = ITEMS.register("foul_fang",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FANG_SHARD = ITEMS.register("fang_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OGRE_CLUB = ITEMS.register("ogre_club",
            () -> new SwordItem(ModToolTiers.OGREWEAPON, 4, 1, new Item.Properties().stacksTo(1)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
