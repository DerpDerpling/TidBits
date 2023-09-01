package derp.tidbits.items;

import derp.tidbits.TidBits;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TidBitsItems {
    public static final Item QUARTZ_SHARD = registerItem("quartz_shard", new Item(new FabricItemSettings()));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));
    public static final Item COAL_NUGGET = registerItem("coal_nugget", new Item(new FabricItemSettings()));
    public static final Item CHARCOAL_NUGGET = registerItem("charcoal_nugget", new Item(new FabricItemSettings()));
    public static final Item GLASS_SHARD = registerItem("glass_shard", new Item(new FabricItemSettings()));
    public static final Item WHITE_STAINED_GLASS_SHARD = registerItem("white_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item LIGHT_GRAY_STAINED_GLASS_SHARD = registerItem("light_gray_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item GRAY_STAINED_GLASS_SHARD = registerItem("gray_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item BLACK_STAINED_GLASS_SHARD = registerItem("black_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item BROWN_STAINED_GLASS_SHARD = registerItem("brown_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item RED_STAINED_GLASS_SHARD = registerItem("red_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item ORANGE_STAINED_GLASS_SHARD = registerItem("orange_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item YELLOW_STAINED_GLASS_SHARD = registerItem("yellow_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item LIME_STAINED_GLASS_SHARD = registerItem("lime_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item GREEN_STAINED_GLASS_SHARD = registerItem("green_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item CYAN_STAINED_GLASS_SHARD = registerItem("cyan_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item LIGHT_BLUE_STAINED_GLASS_SHARD = registerItem("light_blue_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item BLUE_STAINED_GLASS_SHARD = registerItem("blue_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item PURPLE_STAINED_GLASS_SHARD = registerItem("purple_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item MAGENTA_STAINED_GLASS_SHARD = registerItem("magenta_stained_glass_shard", new Item(new FabricItemSettings()));
    public static final Item PINK_STAINED_GLASS_SHARD = registerItem("pink_stained_glass_shard", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TidBits.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TidBits.LOGGER.info("Registering Mod Items for " + TidBits.MOD_ID);
    }
}
