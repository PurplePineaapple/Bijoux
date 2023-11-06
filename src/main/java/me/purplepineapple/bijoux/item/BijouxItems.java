package me.purplepineapple.bijoux.item;

import me.purplepineapple.bijoux.Bijoux;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BijouxItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Bijoux.BIJOUX);


    // RAW GEMSTONES
    public static final RegistryObject<Item> RAW_AQUAMARINE = register("raw_aquamarine", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_OPAL = register("raw_opal", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ROSE_QUARTZ = register("raw_rose_quartz", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUBY = register("raw_ruby", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = register("raw_sapphire", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TOPAZ = register("raw_topaz", () ->
            new Item(new Item.Properties()));

    // GEMSTONES
    public static final RegistryObject<Item> AQUAMARINE = register("aquamarine", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> OPAL = register("opal", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEARL = register("pearl", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ = register("rose_quartz", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = register("ruby", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = register("sapphire", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ = register("topaz", () ->
            new Item(new Item.Properties()));

    // MISC
    public static final RegistryObject<Item> PLATINUM_BAR = register("platinum_bar", () ->
            new Item(new Item.Properties()));


    private static <T extends Item> RegistryObject<Item> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
