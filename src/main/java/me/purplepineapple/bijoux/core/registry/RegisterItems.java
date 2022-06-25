package me.purplepineapple.bijoux.core.registry;

import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.core.BijouxTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RegisterItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Bijoux.MOD_ID);

    public static final RegistryObject<Item> RUBY = register("ruby", () ->
            new Item(new Item.Properties().tab(BijouxTabs.PRECIOUS_STONES)));

    public static final RegistryObject<Item> AQUAMARINE = register("aquamarine", () ->
            new Item(new Item.Properties().tab(BijouxTabs.SEMI_PRECIOUS_STONES)));


    private static <T extends Item>RegistryObject<Item> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
