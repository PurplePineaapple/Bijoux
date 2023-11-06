package me.purplepineapple.bijoux.item;

import me.purplepineapple.bijoux.Bijoux;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BijouxTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, Bijoux.BIJOUX);


    public static final RegistryObject<CreativeModeTab> BIJOUX_TAB = CREATIVE_MODE_TABS.register("bijoux_tab", () ->
            CreativeModeTab.builder()
                    .icon(() -> new ItemStack(BijouxItems.RUBY.get()))
                    .title(Component.translatable("gui.bijoux.bijoux_tab"))
                    .displayItems((params, output) -> {
                //RAW GEMSTONES
                output.accept(BijouxItems.RAW_AQUAMARINE.get());
                output.accept(BijouxItems.RAW_OPAL.get());
                output.accept(BijouxItems.RAW_ROSE_QUARTZ.get());
                output.accept(BijouxItems.RAW_RUBY.get());
                output.accept(BijouxItems.RAW_SAPPHIRE.get());
                output.accept(BijouxItems.RAW_TOPAZ.get());

                // GEMSTONES
                output.accept(BijouxItems.AQUAMARINE.get());
                output.accept(BijouxItems.OPAL.get());
                output.accept(BijouxItems.PEARL.get());
                output.accept(BijouxItems.ROSE_QUARTZ.get());
                output.accept(BijouxItems.RUBY.get());
                output.accept(BijouxItems.SAPPHIRE.get());
                output.accept(BijouxItems.TOPAZ.get());

                // RUBY TOOLS
                output.accept(BijouxItems.RUBY_SWORD.get());
                output.accept(BijouxItems.RUBY_PICKAXE.get());
                output.accept(BijouxItems.RUBY_AXE.get());
                output.accept(BijouxItems.RUBY_SHOVEL.get());
                output.accept(BijouxItems.RUBY_HOE.get());

                // RUBY ARMOR
                output.accept(BijouxItems.RUBY_HELMET.get());
                output.accept(BijouxItems.RUBY_CHESTPLATE.get());
                output.accept(BijouxItems.RUBY_LEGGINGS.get());
                output.accept(BijouxItems.RUBY_BOOTS.get());

                // MISC
                output.accept(BijouxItems.PLATINUM_BAR.get());})
                    .build());


    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }
}
