package xyz.chlamydomonos.clmic.items;

import xyz.chlamydomonos.clmic.core.ChlamydomonosIC;

public class ItemIngot extends MultiIconItem
{
	public ItemIngot()
	{
		super(new String[]{"aluminum", "nickel", "platinum", "mithril"}, "ingot");
		this.setUnlocalizedName("ingot");
		this.setCreativeTab(ChlamydomonosIC.tabChlamydomonosIC);
	}
}
