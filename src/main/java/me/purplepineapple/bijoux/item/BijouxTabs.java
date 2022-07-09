package me.purplepineapple.bijoux.item;

import me.purplepineapple.bijoux.registry.BijouxBlocks;
import me.purplepineapple.bijoux.registry.BijouxItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BijouxTabs {
    public static final CreativeModeTab BLOCKS = new CreativeModeTab("blocks") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(BijouxBlocks.PLATINUM_ORE.get());
        }
    };

    public static final CreativeModeTab MATERIALS = new CreativeModeTab("materials") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(BijouxItems.PLATINUM_BAR.get()); // Placeholder until Textures are complete
        }
    };

    public static final CreativeModeTab TOOLS_ARMOR = new CreativeModeTab("tools_armor") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(BijouxItems.RUBY_HOE.get());
        }
    };

}
