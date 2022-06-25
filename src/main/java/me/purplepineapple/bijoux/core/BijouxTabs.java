package me.purplepineapple.bijoux.core;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BijouxTabs {
    // PRECIOUS STONES: RUBY,
    public static final CreativeModeTab PRECIOUS_STONES = new CreativeModeTab("precious_stones") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(Items.EMERALD); // Placeholder until Textures are complete
        }
    };

    // SEMI-PRECIOUS:
    public static final CreativeModeTab SEMI_PRECIOUS_STONES = new CreativeModeTab("semi_precious_stones") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND); // Placeholder until Textures are complete
        }
    };
}
