package xyz.chlamydomonos.clmic.core.loaders;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryLoader
{
	public OreDictionaryLoader()
	{
		OreDictionary.registerOre("dustAluminum", new ItemStack(ItemLoader.DUST, 1, 0));
		OreDictionary.registerOre("dustNickel", new ItemStack(ItemLoader.DUST, 1, 1));
		OreDictionary.registerOre("dustPlatinum", new ItemStack(ItemLoader.DUST, 1, 2));
		OreDictionary.registerOre("dustMithril", new ItemStack(ItemLoader.DUST, 1, 3));
		OreDictionary.registerOre("dustTinyAluminum", new ItemStack(ItemLoader.DUST_SMALL, 1, 0));
		OreDictionary.registerOre("dustTinyNickel", new ItemStack(ItemLoader.DUST_SMALL, 1, 1));
		OreDictionary.registerOre("dustTinyPlatinum", new ItemStack(ItemLoader.DUST_SMALL, 1, 2));
		OreDictionary.registerOre("dustTinyMithril", new ItemStack(ItemLoader.DUST_SMALL, 1, 3));
		OreDictionary.registerOre("ingotAluminum", new ItemStack(ItemLoader.INGOT, 1, 0));
		OreDictionary.registerOre("ingotNickel", new ItemStack(ItemLoader.INGOT, 1, 1));
		OreDictionary.registerOre("ingotPlatinum", new ItemStack(ItemLoader.INGOT, 1, 2));
		OreDictionary.registerOre("ingotMithril", new ItemStack(ItemLoader.INGOT, 1, 3));
	}
}
