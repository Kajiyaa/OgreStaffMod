package net.apollo.ogreclubmod.util;

import net.apollo.ogreclubmod.OgreClubMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_OGRE_WEAPON = tag("needs_ogre_weapon");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(OgreClubMod.MOD_ID, name));
        }
    }

    public static class Items {

    }
}
