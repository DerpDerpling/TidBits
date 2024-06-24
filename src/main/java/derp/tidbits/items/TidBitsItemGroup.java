package derp.tidbits.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import derp.tidbits.TidBits;

public class TidBitsItemGroup {
    public static final ItemGroup TIDBITS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TidBits.MOD_ID, "tidbits"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tidbits"))
                    .icon(() -> new ItemStack(TidBitsItems.QUARTZ_SHARD)).entries((displayContext, entries) -> {
                        entries.add(TidBitsItems.QUARTZ_SHARD);
                        entries.add(TidBitsItems.COPPER_NUGGET);
                        entries.add(TidBitsItems.COAL_NUGGET);
                        entries.add(TidBitsItems.CHARCOAL_NUGGET);
                        entries.add(TidBitsItems.GLASS_SHARD);
                        entries.add(TidBitsItems.WHITE_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.LIGHT_GRAY_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.GRAY_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.BLACK_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.BROWN_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.RED_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.ORANGE_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.YELLOW_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.LIME_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.GREEN_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.CYAN_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.LIGHT_BLUE_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.BLUE_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.PURPLE_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.MAGENTA_STAINED_GLASS_SHARD);
                        entries.add(TidBitsItems.PINK_STAINED_GLASS_SHARD);
                    }).build());
    public static void registerItemGroups() {
        TidBits.LOGGER.info("Registering Item Groups for " + TidBits.MOD_ID);
    }
}