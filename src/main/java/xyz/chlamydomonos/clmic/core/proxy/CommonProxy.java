package xyz.chlamydomonos.clmic.core.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import xyz.chlamydomonos.clmic.core.loaders.GuiLoader;
import xyz.chlamydomonos.clmic.core.loaders.RecipeLoader;
import xyz.chlamydomonos.clmic.core.loaders.ItemLoader;
import xyz.chlamydomonos.clmic.core.loaders.OreDictionaryLoader;

public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent event)
	{
		new ItemLoader(event);
		new OreDictionaryLoader();
	}
	
	public void init(FMLInitializationEvent event)
	{
		new GuiLoader();
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		new RecipeLoader();
	}
}
