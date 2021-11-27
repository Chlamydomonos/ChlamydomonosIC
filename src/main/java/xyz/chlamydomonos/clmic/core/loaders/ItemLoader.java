package xyz.chlamydomonos.clmic.core.loaders;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import xyz.chlamydomonos.clmic.core.ChlamydomonosIC;
import xyz.chlamydomonos.clmic.items.*;

public class ItemLoader
{
	public static final Item CRUSHED_ORE = new ItemCrushedOre();
	public static final Item PURIFIED_CRUSHED_ORE = new ItemPurifiedCrushedOre();
	public static final Item DUST = new ItemDust();
	public static final Item DUST_SMALL = new ItemDustSmall();
	public static final Item INGOT = new ItemIngot();
	
	public ItemLoader(FMLPreInitializationEvent event)
	{
		register(CRUSHED_ORE, "crushed_ore");
		register(PURIFIED_CRUSHED_ORE, "purified_crushed_ore");
		register(DUST, "dust");
		register(DUST_SMALL, "dust_small");
		register(INGOT, "ingot");
	}
	
    private static void register(Item item, String name)
    {
        GameRegistry.registerItem(item, name, ChlamydomonosIC.MODID);
    }
}
