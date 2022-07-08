package me.purplepineapple.bijoux.core;

import me.purplepineapple.bijoux.core.registry.RegisterBlocks;
import me.purplepineapple.bijoux.core.registry.RegisterItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BijouxTabs {
    public static final CreativeModeTab BLOCKS = new CreativeModeTab("blocks") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(RegisterBlocks.PLATINUM_ORE.get());
        }
    };

    public static final CreativeModeTab MATERIALS = new CreativeModeTab("materials") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(RegisterItems.PLATINUM_BAR.get()); // Placeholder until Textures are complete
        }
    };

    public static final CreativeModeTab TOOLS_ARMOR = new CreativeModeTab("tools_armor") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(RegisterItems.RUBY_HOE.get());
        }
    };

}
