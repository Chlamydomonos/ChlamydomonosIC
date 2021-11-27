package xyz.chlamydomonos.clmic.core.loaders;

import cpw.mods.fml.common.registry.GameRegistry;
import ic2.api.item.IC2Items;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.RecipeInputOreDict;
import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.nbt.NBTTagCompound;

public class RecipeLoader
{
	private NBTTagCompound water = new NBTTagCompound();
	private NBTTagCompound heat_low = new NBTTagCompound();
	private NBTTagCompound heat_high = new NBTTagCompound();
	
	public RecipeLoader()
	{
		water.setInteger("amount", 1000);
		heat_low.setInteger("minHeat", 1000);
		heat_high.setInteger("minHeat", 2000);
		loadCraftRecipes();
		loadSmeltRecipes();
		loadICRecipes();
	}
	
	private void loadCraftRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(ItemLoader.DUST, 1, 0), new Object[] {"###", "###", "###", '#', new ItemStack(ItemLoader.DUST_SMALL, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.DUST, 1, 1), new Object[] {"###", "###", "###", '#', new ItemStack(ItemLoader.DUST_SMALL, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.DUST, 1, 2), new Object[] {"###", "###", "###", '#', new ItemStack(ItemLoader.DUST_SMALL, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(ItemLoader.DUST, 1, 3), new Object[] {"###", "###", "###", '#', new ItemStack(ItemLoader.DUST_SMALL, 1, 3)});
	}
	
	private void loadSmeltRecipes()
	{
		GameRegistry.addSmelting(new ItemStack(ItemLoader.CRUSHED_ORE, 1, 0), new ItemStack(ItemLoader.INGOT, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.CRUSHED_ORE, 1, 1), new ItemStack(ItemLoader.INGOT, 1, 1), 0);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.CRUSHED_ORE, 1, 2), new ItemStack(ItemLoader.INGOT, 1, 2), 0);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.CRUSHED_ORE, 1, 3), new ItemStack(ItemLoader.INGOT, 1, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.PURIFIED_CRUSHED_ORE, 1, 0), new ItemStack(ItemLoader.INGOT, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.PURIFIED_CRUSHED_ORE, 1, 1), new ItemStack(ItemLoader.INGOT, 1, 1), 0);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.PURIFIED_CRUSHED_ORE, 1, 2), new ItemStack(ItemLoader.INGOT, 1, 2), 0);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.PURIFIED_CRUSHED_ORE, 1, 3), new ItemStack(ItemLoader.INGOT, 1, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.DUST, 1, 0), new ItemStack(ItemLoader.INGOT, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.DUST, 1, 1), new ItemStack(ItemLoader.INGOT, 1, 1), 0);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.DUST, 1, 2), new ItemStack(ItemLoader.INGOT, 1, 2), 0);
		GameRegistry.addSmelting(new ItemStack(ItemLoader.DUST, 1, 3), new ItemStack(ItemLoader.INGOT, 1, 3), 0);
	}
	private void loadICRecipes()
	{
		Recipes.macerator.addRecipe(new RecipeInputOreDict("oreAluminum"), null, new ItemStack(ItemLoader.CRUSHED_ORE, 2, 0));
		Recipes.macerator.addRecipe(new RecipeInputOreDict("oreNickel"), null, new ItemStack(ItemLoader.CRUSHED_ORE, 2, 1));
		Recipes.macerator.addRecipe(new RecipeInputOreDict("orePlatinum"), null, new ItemStack(ItemLoader.CRUSHED_ORE, 2, 2));
		Recipes.macerator.addRecipe(new RecipeInputOreDict("oreMithril"), null, new ItemStack(ItemLoader.CRUSHED_ORE, 2, 3));
		Recipes.oreWashing.addRecipe(new RecipeInputItemStack(new ItemStack(ItemLoader.CRUSHED_ORE, 1, 0)), water, new ItemStack(ItemLoader.PURIFIED_CRUSHED_ORE, 1, 0), new ItemStack(ItemLoader.DUST_SMALL, 2, 0), IC2Items.getItem("stoneDust"));
		Recipes.oreWashing.addRecipe(new RecipeInputItemStack(new ItemStack(ItemLoader.CRUSHED_ORE, 1, 1)), water, new ItemStack(ItemLoader.PURIFIED_CRUSHED_ORE, 1, 1), new ItemStack(ItemLoader.DUST_SMALL, 2, 1), IC2Items.getItem("stoneDust"));
		Recipes.oreWashing.addRecipe(new RecipeInputItemStack(new ItemStack(ItemLoader.CRUSHED_ORE, 1, 2)), water, new ItemStack(ItemLoader.PURIFIED_CRUSHED_ORE, 1, 2), new ItemStack(ItemLoader.DUST_SMALL, 2, 2), IC2Items.getItem("stoneDust"));
		Recipes.oreWashing.addRecipe(new RecipeInputItemStack(new ItemStack(ItemLoader.CRUSHED_ORE, 1, 3)), water, new ItemStack(ItemLoader.PURIFIED_CRUSHED_ORE, 1, 3), new ItemStack(ItemLoader.DUST_SMALL, 2, 3), IC2Items.getItem("stoneDust"));
		Recipes.centrifuge.addRecipe(new RecipeInputItemStack(new ItemStack(ItemLoader.PURIFIED_CRUSHED_ORE, 1, 0)), heat_low, new ItemStack(ItemLoader.DUST, 1, 0), new ItemStack(ItemLoader.DUST_SMALL, 1, 0));
		Recipes.centrifuge.addRecipe(new RecipeInputItemStack(new ItemStack(ItemLoader.PURIFIED_CRUSHED_ORE, 1, 1)), heat_low, new ItemStack(ItemLoader.DUST, 1, 1), new ItemStack(ItemLoader.DUST_SMALL, 1, 1));
		Recipes.centrifuge.addRecipe(new RecipeInputItemStack(new ItemStack(ItemLoader.PURIFIED_CRUSHED_ORE, 1, 2)), heat_high, new ItemStack(ItemLoader.DUST, 1, 2), new ItemStack(ItemLoader.DUST_SMALL, 1, 2));
		Recipes.centrifuge.addRecipe(new RecipeInputItemStack(new ItemStack(ItemLoader.PURIFIED_CRUSHED_ORE, 1, 3)), heat_high, new ItemStack(ItemLoader.DUST, 1, 3), new ItemStack(ItemLoader.DUST_SMALL, 1, 3));
		Recipes.macerator.addRecipe(new RecipeInputOreDict("ingotAluminum"), null, new ItemStack(ItemLoader.DUST, 1, 0));
		Recipes.macerator.addRecipe(new RecipeInputOreDict("ingotNickel"), null, new ItemStack(ItemLoader.DUST, 1, 1));
		Recipes.macerator.addRecipe(new RecipeInputOreDict("ingotPlatinum"), null, new ItemStack(ItemLoader.DUST, 1, 2));
		Recipes.macerator.addRecipe(new RecipeInputOreDict("ingotMithril"), null, new ItemStack(ItemLoader.DUST, 1, 3));
	}
}
