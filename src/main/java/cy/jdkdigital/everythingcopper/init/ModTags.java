package cy.jdkdigital.everythingcopper.init;

import cy.jdkdigital.everythingcopper.EverythingCopper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static final TagKey<Block> NEEDS_COPPER_TOOL = BlockTags.create(new ResourceLocation(EverythingCopper.MODID, "needs_copper_tool"));
    public static final TagKey<Item> WAXING_ITEMS = ItemTags.create(new ResourceLocation(EverythingCopper.MODID, "waxing_items"));
    public static final TagKey<Item> COPPER_NUGGET = ItemTags.create(new ResourceLocation("forge", "nuggets/copper"));
}
