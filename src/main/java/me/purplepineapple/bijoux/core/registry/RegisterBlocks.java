package me.purplepineapple.bijoux.core.registry;

import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.core.BijouxTabs;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class RegisterBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Bijoux.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = RegisterItems.ITEMS;

    public static final RegistryObject<Block> AQUAMARINE_ORE = register("aquamarine_ore", () ->
                    new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BijouxTabs.BLOCKS)));
    public static final RegistryObject<Block> PLATINUM_ORE = register("platinum_ore", () ->
                    new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F).sound(SoundType.STONE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BijouxTabs.BLOCKS)));
    public static final RegistryObject<Block> ROSE_QUARTZ_ORE = register("rose_quartz_ore", () ->
                    new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BijouxTabs.BLOCKS)));
    public static final RegistryObject<Block> RUBY_ORE = register("ruby_ore", () ->
            new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BijouxTabs.BLOCKS)));



    private static <T extends Block> RegistryObject<T> registerBlock(final String name,
                                                                     final Supplier<? extends T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> blocks,
                                                                Function<RegistryObject<T>,Supplier<? extends Item>> item) {
        RegistryObject<T> object = registerBlock(name, blocks);
        ITEMS.register(name, item.apply(object));
        return object;
    }

}
