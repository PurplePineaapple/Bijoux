package me.purplepineapple.bijoux.block;

import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.item.BijouxItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class BijouxBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Bijoux.BIJOUX);
    public static final DeferredRegister<Item> ITEMS = BijouxItems.ITEMS;

    // GEM BLOCKS
   public static final RegistryObject<Block> AQUAMARINE_BLOCK = register("aquamarine_block", () ->
           new Block(BlockBehaviour.Properties.of()
                   .mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(5.75f, 3.0f)
                   .sound(SoundType.METAL)
           ), object -> () -> new BlockItem(object.get(), new Item.Properties()));
   public static final RegistryObject<Block> OPAL_BLOCK = register("opal_block", () ->
            new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(4.5f, 3.0f)
                    .sound(SoundType.METAL)
            ), object -> () -> new BlockItem(object.get(), new Item.Properties()));
   public static final RegistryObject<Block> PLATINUM_BLOCK = register("platinum_block", () ->
            new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(3.0f, 3.0f)
                    .sound(SoundType.METAL)
            ), object -> () -> new BlockItem(object.get(), new Item.Properties()));
   public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = register("rose_quartz_block", () ->
            new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(5.0f, 3.0f)
                    .sound(SoundType.METAL)
            ), object -> () -> new BlockItem(object.get(), new Item.Properties()));
   public static final RegistryObject<Block> RUBY_BLOCK = register("ruby_block", () ->
            new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(7.0f, 3.0f)
                    .sound(SoundType.METAL)
            ), object -> () -> new BlockItem(object.get(), new Item.Properties()));
   public static final RegistryObject<Block> SAPPHIRE_BLOCK = register("sapphire_block", () ->
            new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(7.0f, 3.0f)
                    .sound(SoundType.METAL)
            ), object -> () -> new BlockItem(object.get(), new Item.Properties()));
   public static final RegistryObject<Block> TOPAZ_BLOCK = register("topaz_block", () ->
            new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(6.0f, 3.0f)
                    .sound(SoundType.METAL)
            ), object -> () -> new BlockItem(object.get(), new Item.Properties()));



    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> blocks,
                                                                Function<RegistryObject<T>,Supplier<? extends Item>> item) {
        RegistryObject<T> object = registerBlock(name, blocks);
        ITEMS.register(name, item.apply(object));
        return object;
    }
    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}

