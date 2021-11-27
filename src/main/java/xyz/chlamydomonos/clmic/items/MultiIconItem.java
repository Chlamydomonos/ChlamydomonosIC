package xyz.chlamydomonos.clmic.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import xyz.chlamydomonos.clmic.core.ChlamydomonosIC;

public class MultiIconItem extends Item
{
	public String[] types;
	private IIcon icons[];
	public MultiIconItem(String[] types, String textureName)
	{
		this.types = types;
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setTextureName(ChlamydomonosIC.MODID + ":" + textureName);
	}
	
	@Override
	public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_)
	{
		for(int i = 0; i < types.length; i++)
			p_150895_3_.add(new ItemStack(p_150895_1_, 1, i));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int p_77617_1_)
	{
		int j = MathHelper.clamp_int(p_77617_1_, 0, types.length - 1);
		return this.icons[j];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack p_77667_1_)
	{
		int i = MathHelper.clamp_int(p_77667_1_.getItemDamage(), 0, types.length - 1);
		return super.getUnlocalizedName(p_77667_1_) + "." + types[i];
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister p_94581_1_)
	{
        this.icons = new IIcon[types.length];

        for (int i = 0; i < types.length; ++i)
        {
            this.icons[i] = p_94581_1_.registerIcon(this.getIconString() + "_" + types[i]);
        }
	}
}
