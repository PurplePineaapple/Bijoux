package me.purplepineapple.bijoux.core.registry;

import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.common.item.ArmorMaterials;
import me.purplepineapple.bijoux.common.item.ToolTiers;
import me.purplepineapple.bijoux.core.BijouxTabs;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RegisterItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Bijoux.MOD_ID);

    public static final RegistryObject<Item> RAW_AQUAMARINE = register("raw_aquamarine", () ->
            new Item(new Item.Properties().tab(BijouxTabs.MATERIALS)));
    public static final RegistryObject<Item> RAW_ROSE_QUARTZ = register("raw_rose_quartz", () ->
            new Item(new Item.Properties().tab(BijouxTabs.MATERIALS)));
    public static final RegistryObject<Item> RAW_RUBY = register("raw_ruby", () ->
            new Item(new Item.Properties().tab(BijouxTabs.MATERIALS)));

    public static final RegistryObject<Item> AQUAMARINE = register("aquamarine", () ->
            new Item(new Item.Properties().tab(BijouxTabs.MATERIALS)));
    public static final RegistryObject<Item> ROSE_QUARTZ = register("rose_quartz", () ->
            new Item(new Item.Properties().tab(BijouxTabs.MATERIALS)));
    public static final RegistryObject<Item> RUBY = register("ruby", () ->
            new Item(new Item.Properties().tab(BijouxTabs.MATERIALS)));

    public static final RegistryObject<Item> RUBY_SWORD = register("ruby_sword", () ->
            new SwordItem(ToolTiers.RUBY, 3, -2.4F, new Item.Properties().tab(BijouxTabs.TOOLS_ARMOR)));
    public static final RegistryObject<Item> RUBY_PICKAXE = register("ruby_pickaxe", () ->
            new PickaxeItem(ToolTiers.RUBY, 1, -2.8F, new Item.Properties().tab(BijouxTabs.TOOLS_ARMOR)));
    public static final RegistryObject<Item> RUBY_AXE = register("ruby_axe", () ->
            new AxeItem(ToolTiers.RUBY, 5.0F, -3.5F, new Item.Properties().tab(BijouxTabs.TOOLS_ARMOR)));
    public static final RegistryObject<Item> RUBY_SHOVEL = register("ruby_shovel", () ->
            new ShovelItem(ToolTiers.RUBY, 1.5F, -3.0F, new Item.Properties().tab(BijouxTabs.TOOLS_ARMOR)));
    public static final RegistryObject<Item> RUBY_HOE = register("ruby_hoe", () ->
            new HoeItem(ToolTiers.RUBY, -4, 0.0F, new Item.Properties().tab(BijouxTabs.TOOLS_ARMOR)));

    public static final RegistryObject<Item> RUBY_HELMET = register("ruby_helmet", () ->
            new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.HEAD, new Item.Properties().tab(BijouxTabs.TOOLS_ARMOR)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = register("ruby_chestplate", () ->
            new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.CHEST, new Item.Properties().tab(BijouxTabs.TOOLS_ARMOR)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = register("ruby_leggings", () ->
            new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.LEGS, new Item.Properties().tab(BijouxTabs.TOOLS_ARMOR)));
    public static final RegistryObject<Item> RUBY_BOOTS = register("ruby_boots", () ->
            new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.FEET, new Item.Properties().tab(BijouxTabs.TOOLS_ARMOR)));

    public static final RegistryObject<Item> PLATINUM_BAR = register("platinum_bar", () ->
            new Item(new Item.Properties().tab(BijouxTabs.MATERIALS)));



    private static <T extends Item>RegistryObject<Item> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
