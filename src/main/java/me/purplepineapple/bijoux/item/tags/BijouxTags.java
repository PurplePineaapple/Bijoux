package me.purplepineapple.bijoux.item.tags;

import me.purplepineapple.bijoux.Bijoux;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class BijouxTags {

    public static class Blocks {
        // All
        public static final TagKey<Block> GEM_BLOCKS = createTag("gems/gem_blocks");



        // Ruby

        public static final TagKey<Block> RUBY_ORES = createTag("gems/ruby_ores");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(new ResourceLocation(Bijoux.MOD_ID, name));
        }
        private static TagKey<Block> createForgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> RUBY = createForgeTag("gems/ruby");
        public static final TagKey<Item> RUBY_GEMS = createTag("gems/ruby_gems");
        public static final TagKey<Item> RUBY_TOOLS = createTag("gems/ruby_tools");
        public static final TagKey<Item> RUBY_ARMOR = createTag("gems/ruby_armor");



        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(new ResourceLocation(Bijoux.MOD_ID, name));
        }

        private static TagKey<Item> createForgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }
}
