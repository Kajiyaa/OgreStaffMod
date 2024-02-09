package net.apollo.ogreclubmod.item;

import net.apollo.ogreclubmod.OgreClubMod;
import net.apollo.ogreclubmod.util.ModTags;
import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier OGREWEAPON = TierSortingRegistry.registerTier(
        new ForgeTier(5, 3000, 4f, 10f,   25,
                ModTags.Blocks.NEEDS_OGRE_WEAPON,() -> Ingredient.of(ModItems.FOUL_FANG.get())),
        new ResourceLocation(OgreClubMod.MOD_ID, "foul_fang"), List.of(Tiers.NETHERITE), List.of());
}
