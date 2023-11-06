package me.purplepineapple.bijoux.item;

import me.purplepineapple.bijoux.Bijoux;
import net.minecraft.world.item.*;
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

    // RUBY TOOLS
    public static final RegistryObject<Item> RUBY_SWORD = register("ruby_sword", () ->
            new SwordItem(BijouxTiers.RUBY, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_PICKAXE = register("ruby_pickaxe", () ->
            new PickaxeItem(BijouxTiers.RUBY, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_AXE = register("ruby_axe", () ->
            new AxeItem(BijouxTiers.RUBY, 5.0f, -3.5f, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHOVEL = register("ruby_shovel", () ->
            new ShovelItem(BijouxTiers.RUBY, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_HOE = register("ruby_hoe", () ->
            new HoeItem(BijouxTiers.RUBY, -4, -3.0f, new Item.Properties()));

    // RUBY ARMOR
    public static final RegistryObject<Item> RUBY_HELMET = register("ruby_helmet", () ->
            new ArmorItem(BijouxMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = register("ruby_chestplate", () ->
            new ArmorItem(BijouxMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = register("ruby_leggings", () ->
            new ArmorItem(BijouxMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BOOTS = register("ruby_boots", () ->
            new ArmorItem(BijouxMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));

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
